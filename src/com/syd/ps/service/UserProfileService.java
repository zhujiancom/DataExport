package com.syd.ps.service;

import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

import com.syd.ps.bean.UserProfile;
import com.syd.ps.mapper.UserProfileMapper;

public class UserProfileService extends AbstractExportService<UserProfile> {
	
	public void exportToExcel(Collection<UserProfile> dataset,OutputStream out){
		poiService.exportExcel(UserProfile.class,"userProfile", null, dataset, out, "yyyy-MM-dd HH:mm:ss");
	}
	
	@Override
	protected List<UserProfile> buildDataSet(Long id) {
		List<UserProfile> result = jdbcTemplate.query("select * from "+getTableName()+" where account="+id, new UserProfileMapper());
//		System.out.println("["+Thread.currentThread().getName()+"]"+id + "- 条数： "+result.size());
		return result;
	}
}

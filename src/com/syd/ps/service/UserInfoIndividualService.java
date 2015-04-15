package com.syd.ps.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

import com.syd.ps.bean.TempList;
import com.syd.ps.bean.UserInfoIndividual;
import com.syd.ps.mapper.UserInfoIndividualMapper;

public class UserInfoIndividualService extends AbstractExportService<UserInfoIndividual> {
	public void exportToExcel(Collection<UserInfoIndividual> dataset,OutputStream out){
		poiService.exportExcel(UserInfoIndividual.class,"userInfoIndividual", null, dataset, out, "yyyy-MM-dd HH:mm:ss");
	}
	
	public List<UserInfoIndividual> buildDataSet(Long id){
		List<UserInfoIndividual> result = jdbcTemplate.query("select * from "+getTableName()+" where aeid="+id, new UserInfoIndividualMapper());
//		System.out.println("["+Thread.currentThread().getName()+"]"+id + "- 条数： "+result.size());
		return result;
	}
	
	@Override
	public void export() throws Exception{
		stack = getAllTempList();
		while(!stack.isEmpty()){
			TempList item = stack.peek();
			List<UserInfoIndividual> dataset = buildDataSet(item.getAeid());
			String sCort = item.getsCort();
//			System.out.println(item.getId()+" - "+sCort);
			String directPath = getRootPath()+File.separator+sCort+File.separator+item.getAeid()+".xls";
//			System.out.println("directPath = "+directPath);
			File file = new File(directPath);
			if(!file.exists()){
				file.getParentFile().mkdirs();
			}
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
			exportToExcel(dataset,bos);
			stack.pop();
		}
	}
	
	public List<UserInfoIndividual> buildDataSet(String aeid){
		List<UserInfoIndividual> result = jdbcTemplate.query("select * from "+getTableName()+" where aeid='"+aeid+"'", new UserInfoIndividualMapper());
//		System.out.println("["+Thread.currentThread().getName()+"]"+id + "- 条数： "+result.size());
		return result;
	}
}

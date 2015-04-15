package com.syd.ps.service;

import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

import com.syd.ps.bean.Settled4Cfd;
import com.syd.ps.mapper.Settled4CfdMapper;

public class Settled4CfdService extends AbstractExportService<Settled4Cfd> {
	public void exportToExcel(Collection<Settled4Cfd> dataset,OutputStream out){
		poiService.exportExcel(Settled4Cfd.class,"settled4cfd", null, dataset, out, "yyyy-MM-dd HH:mm:ss");
	}
	
	public List<Settled4Cfd> buildDataSet(Long id){
		List<Settled4Cfd> result = jdbcTemplate.query("select * from "+getTableName()+" where account="+id, new Settled4CfdMapper());
//		System.out.println("["+Thread.currentThread().getName()+"]"+id + "- 条数： "+result.size());
		return result;
	}
}

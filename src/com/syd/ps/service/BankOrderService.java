package com.syd.ps.service;

import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

import com.syd.ps.bean.BankOrder;
import com.syd.ps.mapper.BankOrderMapper;

public class BankOrderService extends AbstractExportService<BankOrder>{
	public void exportToExcel(Collection<BankOrder> dataset,OutputStream out){
		poiService.exportExcel(BankOrder.class,"bankorder", null, dataset, out, "yyyy-MM-dd HH:mm:ss");
	}
	
	public List<BankOrder> buildDataSet(Long id){
		List<BankOrder> result = jdbcTemplate.query("select * from "+getTableName()+" where account="+id, new BankOrderMapper());
//		System.out.println("["+Thread.currentThread().getName()+"]"+id + "- 条数： "+result.size());
		return result;
	}

	@Override
	protected String taskType() {
		return "bankorder";
	}
}

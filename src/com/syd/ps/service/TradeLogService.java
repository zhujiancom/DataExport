package com.syd.ps.service;

import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

import com.syd.ps.bean.TradeLog;
import com.syd.ps.mapper.TradeLogMapper;

public class TradeLogService extends AbstractExportService<TradeLog>{
	public void exportToExcel(Collection<TradeLog> dataset,OutputStream out){
		poiService.exportExcel(TradeLog.class,"tradeLog", null, dataset, out, "yyyy-MM-dd HH:mm:ss");
	}
	
	/*public void exportTxt() throws Exception{
		stack = getAllTempList();
		while(!stack.isEmpty()){
			TempList item = stack.peek();
			List<TradeLog> dataset = getTradeLogs(item.getId());
			String sCort = item.getsCort();
//			System.out.println(item.getId()+" - "+sCort);
			String directPath = "E:\\"+File.separator+"Datas"+File.separator+"trade"+File.separator+sCort+File.separator+item.getId()+".txt";
//			System.out.println("directPath = "+directPath);
			File file = new File(directPath);
			if(!file.exists()){
				file.getParentFile().mkdirs();
			}
//			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			StringBuffer header = new StringBuffer();
			header.append("guid").append("$")
				  .append("account").append("$")
				  .append("aeid").append("$")
				  .append("type").append("$")
				  .append("action").append("$")
				  .append("orderid").append("$")
				  .append("description").append("$")
				  .append("operator").append("$")
				  .append("tradetime").append("$")
				  .append("ipaddress").append("$")
				  .append("operatorRoleType").append("$")
				  .append("lots").append("$");
			writer.write(header.toString());
			writer.newLine();
			for(TradeLog trade:dataset){
				StringBuffer sb = new StringBuffer();
				sb.append(trade.getGuid()).append("$").append(trade.getAccount())
										  .append("$").append(trade.getAeid())
										  .append("$").append(trade.getType())
										  .append("$").append(trade.getAction())
										  .append("$").append(trade.getOrderid())
										  .append("$").append(trade.getDescription())
										  .append("$").append(trade.getOperator())
										  .append("$").append(trade.getTradeTime())
										  .append("$").append(trade.getIpAddress())
										  .append("$").append(trade.getOperatorRoleType())
										  .append("$").append(trade.getLots());
				writer.write(sb.toString());
				writer.newLine();
			}
			writer.close();
			stack.pop();
		}
	}*/
	
	@Override
	protected List<TradeLog> buildDataSet(Long id) {
		List<TradeLog> result = jdbcTemplate.query("select * from "+getTableName()+" where account="+id, new TradeLogMapper());
//		System.out.println("["+Thread.currentThread().getName()+"]"+id + "- 条数： "+result.size());
		return result;
	}
}

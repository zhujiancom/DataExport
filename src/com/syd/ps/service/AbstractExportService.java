package com.syd.ps.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.syd.ps.bean.TempList;
import com.syd.ps.mapper.TempListMapper;

public class AbstractExportService<T> {
	@SuppressWarnings("unused")
	private DataSource dataSource;
	
	protected JdbcTemplate jdbcTemplate;
	
	protected POIService<T> poiService;
	
	protected Stack<TempList> stack;
	
	private String rootpath;
	
	private String baseTable;
	
	private String tableName;
	
	public void setTableName(String tableName){
		this.tableName = tableName;
	}
	
	public String getTableName(){
		return tableName;
	}
	
	public void setBaseTable(String baseTable){
		this.baseTable = baseTable;
	}
	
	public void setRootpath(String rootpath){
		this.rootpath = rootpath;
	}
	
	public void setPoiService(POIService<T> poiService){
		this.poiService = poiService;
	}
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void export() throws Exception{
		stack = getAllTempList();
		while(!stack.isEmpty()){
			TempList item = stack.peek();
			List<T> dataset = buildDataSet(item.getId());
			String sCort = item.getsCort();
//			System.out.println(item.getId()+" - "+sCort);
			String directPath = getRootPath()+File.separator+sCort+File.separator+taskType()+"_"+item.getId()+".xls";
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
	
	public Stack<TempList> getAllTempList(){
		List<TempList> list = jdbcTemplate.query("select * from "+baseTable, new TempListMapper());
		Stack<TempList> stack = new Stack<TempList>();
		for(TempList item : list){
			stack.push(item);
		}
		return stack;
	}
	
	protected List<T> buildDataSet(Long id){return null;}
	public void exportToExcel(Collection<T> dataset,OutputStream out){}
	protected String taskType(){return null;};
	
	protected String getRootPath(){
		return rootpath;
	}
	
}

package com.syd.ps.bean;

public class TempList {
	private Long id;
	
	private Integer nLevel;
	
	private String sCort;
	
	private String aeid;
	
	public TempList(){}
	
	public TempList(Long id,String sCort,String aeid){
		this.id = id;
		this.sCort = sCort;
		this.aeid = aeid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getnLevel() {
		return nLevel;
	}

	public void setnLevel(Integer nLevel) {
		this.nLevel = nLevel;
	}

	public String getsCort() {
		return sCort;
	}

	public void setsCort(String sCort) {
		this.sCort = sCort;
	}

	public String getAeid() {
		return aeid;
	}

	public void setAeid(String aeid) {
		this.aeid = aeid;
	}
}

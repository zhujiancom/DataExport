package com.syd.ps.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class TradeLog {
	private String guid;
	
	private Long account;
	
	private String aeid;
	
	private Integer type;
	
	private Integer action;
	
	private String orderid;
	
	private String description;
	
	private String operator;
	
	private Timestamp tradeTime;
	
	private String ipAddress;
	
	private Integer operatorRoleType;
	
	private BigDecimal lots;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Long getAccount() {
		return account;
	}

	public void setAccount(Long account) {
		this.account = account;
	}

	public String getAeid() {
		return aeid;
	}

	public void setAeid(String aeid) {
		this.aeid = aeid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getAction() {
		return action;
	}

	public void setAction(Integer action) {
		this.action = action;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Timestamp getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Timestamp tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Integer getOperatorRoleType() {
		return operatorRoleType;
	}

	public void setOperatorRoleType(Integer operatorRoleType) {
		this.operatorRoleType = operatorRoleType;
	}

	public BigDecimal getLots() {
		return lots;
	}

	public void setLots(BigDecimal lots) {
		this.lots = lots;
	}
}

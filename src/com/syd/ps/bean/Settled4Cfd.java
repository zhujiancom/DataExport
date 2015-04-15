package com.syd.ps.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Settled4Cfd {
	private BigDecimal ticket;
	
	private Integer splitno;
	
	private String instrument;
	
	private Long account;
	
	private Long oorderId;
	
	private Integer oosplitno;
	
	private Long corderId;
	
	private Integer cosplitno;
	
	private Integer buysell;
	
	private BigDecimal lots;
	
	private BigDecimal openPrice;
	
	private String openTradeDay;
	
	private Timestamp openTime;
	
	private BigDecimal closePrice;
	
	private BigDecimal profitloss;
	
	private BigDecimal rollover;
	
	private String closeTradeDay;
	
	private Timestamp closeTime;
	
	private Integer reason;
	
	private String balanceCur;
	
	private BigDecimal balanceRate;
	
	private BigDecimal commision4open;
	
	private BigDecimal subCommisionSystem4open;
	
	private BigDecimal subCommisionGroup4open;
	
	private BigDecimal subCommisionAccount4open;
	
	private BigDecimal commision4close;
	
	private BigDecimal subCommisionSystem4close;
	
	private BigDecimal subCommisionGroup4close;
	
	private BigDecimal subCommisionAccount4close;
	
	private String openCommisionCurrency;
	
	private String closeCommisionCurrency;
	
	private BigDecimal IBChargedFeeByPoint;
	
	private BigDecimal IBChargedFeeByPointSystem;
	
	private BigDecimal IBChargedFeeByPointGroup;
	
	private BigDecimal IBChargedFeeByPointAccount;
	
	private String IBChargedFeeByPointCurrency;
	
	private BigDecimal marginRate;
	
	private String openGroup;
	
	private String closeGroup;
	
	private BigDecimal amountPerlot;
	
	private Integer isDelivery;

	public BigDecimal getTicket() {
		return ticket;
	}

	public void setTicket(BigDecimal ticket) {
		this.ticket = ticket;
	}

	public Integer getSplitno() {
		return splitno;
	}

	public void setSplitno(Integer splitno) {
		this.splitno = splitno;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public Long getAccount() {
		return account;
	}

	public void setAccount(Long account) {
		this.account = account;
	}

	public Long getOorderId() {
		return oorderId;
	}

	public void setOorderId(Long oorderId) {
		this.oorderId = oorderId;
	}

	public Integer getOosplitno() {
		return oosplitno;
	}

	public void setOosplitno(Integer oosplitno) {
		this.oosplitno = oosplitno;
	}

	public Long getCorderId() {
		return corderId;
	}

	public void setCorderId(Long corderId) {
		this.corderId = corderId;
	}

	public Integer getCosplitno() {
		return cosplitno;
	}

	public void setCosplitno(Integer cosplitno) {
		this.cosplitno = cosplitno;
	}

	public Integer getBuysell() {
		return buysell;
	}

	public void setBuysell(Integer buysell) {
		this.buysell = buysell;
	}

	public BigDecimal getLots() {
		return lots;
	}

	public void setLots(BigDecimal lots) {
		this.lots = lots;
	}

	public BigDecimal getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}

	public String getOpenTradeDay() {
		return openTradeDay;
	}

	public void setOpenTradeDay(String openTradeDay) {
		this.openTradeDay = openTradeDay;
	}

	public Timestamp getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Timestamp openTime) {
		this.openTime = openTime;
	}

	public BigDecimal getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}

	public BigDecimal getProfitloss() {
		return profitloss;
	}

	public void setProfitloss(BigDecimal profitloss) {
		this.profitloss = profitloss;
	}

	public BigDecimal getRollover() {
		return rollover;
	}

	public void setRollover(BigDecimal rollover) {
		this.rollover = rollover;
	}

	public String getCloseTradeDay() {
		return closeTradeDay;
	}

	public void setCloseTradeDay(String closeTradeDay) {
		this.closeTradeDay = closeTradeDay;
	}

	public Timestamp getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Timestamp closeTime) {
		this.closeTime = closeTime;
	}

	public Integer getReason() {
		return reason;
	}

	public void setReason(Integer reason) {
		this.reason = reason;
	}

	public String getBalanceCur() {
		return balanceCur;
	}

	public void setBalanceCur(String balanceCur) {
		this.balanceCur = balanceCur;
	}

	public BigDecimal getBalanceRate() {
		return balanceRate;
	}

	public void setBalanceRate(BigDecimal balanceRate) {
		this.balanceRate = balanceRate;
	}

	public BigDecimal getCommision4open() {
		return commision4open;
	}

	public void setCommision4open(BigDecimal commision4open) {
		this.commision4open = commision4open;
	}

	public BigDecimal getSubCommisionSystem4open() {
		return subCommisionSystem4open;
	}

	public void setSubCommisionSystem4open(BigDecimal subCommisionSystem4open) {
		this.subCommisionSystem4open = subCommisionSystem4open;
	}

	public BigDecimal getSubCommisionGroup4open() {
		return subCommisionGroup4open;
	}

	public void setSubCommisionGroup4open(BigDecimal subCommisionGroup4open) {
		this.subCommisionGroup4open = subCommisionGroup4open;
	}

	public BigDecimal getSubCommisionAccount4open() {
		return subCommisionAccount4open;
	}

	public void setSubCommisionAccount4open(BigDecimal subCommisionAccount4open) {
		this.subCommisionAccount4open = subCommisionAccount4open;
	}

	public BigDecimal getCommision4close() {
		return commision4close;
	}

	public void setCommision4close(BigDecimal commision4close) {
		this.commision4close = commision4close;
	}

	public BigDecimal getSubCommisionSystem4close() {
		return subCommisionSystem4close;
	}

	public void setSubCommisionSystem4close(BigDecimal subCommisionSystem4close) {
		this.subCommisionSystem4close = subCommisionSystem4close;
	}

	public BigDecimal getSubCommisionGroup4close() {
		return subCommisionGroup4close;
	}

	public void setSubCommisionGroup4close(BigDecimal subCommisionGroup4close) {
		this.subCommisionGroup4close = subCommisionGroup4close;
	}

	public BigDecimal getSubCommisionAccount4close() {
		return subCommisionAccount4close;
	}

	public void setSubCommisionAccount4close(BigDecimal subCommisionAccount4close) {
		this.subCommisionAccount4close = subCommisionAccount4close;
	}

	public String getOpenCommisionCurrency() {
		return openCommisionCurrency;
	}

	public void setOpenCommisionCurrency(String openCommisionCurrency) {
		this.openCommisionCurrency = openCommisionCurrency;
	}

	public String getCloseCommisionCurrency() {
		return closeCommisionCurrency;
	}

	public void setCloseCommisionCurrency(String closeCommisionCurrency) {
		this.closeCommisionCurrency = closeCommisionCurrency;
	}

	public BigDecimal getIBChargedFeeByPoint() {
		return IBChargedFeeByPoint;
	}

	public void setIBChargedFeeByPoint(BigDecimal iBChargedFeeByPoint) {
		IBChargedFeeByPoint = iBChargedFeeByPoint;
	}

	public BigDecimal getIBChargedFeeByPointSystem() {
		return IBChargedFeeByPointSystem;
	}

	public void setIBChargedFeeByPointSystem(BigDecimal iBChargedFeeByPointSystem) {
		IBChargedFeeByPointSystem = iBChargedFeeByPointSystem;
	}

	public BigDecimal getIBChargedFeeByPointGroup() {
		return IBChargedFeeByPointGroup;
	}

	public void setIBChargedFeeByPointGroup(BigDecimal iBChargedFeeByPointGroup) {
		IBChargedFeeByPointGroup = iBChargedFeeByPointGroup;
	}

	public BigDecimal getIBChargedFeeByPointAccount() {
		return IBChargedFeeByPointAccount;
	}

	public void setIBChargedFeeByPointAccount(BigDecimal iBChargedFeeByPointAccount) {
		IBChargedFeeByPointAccount = iBChargedFeeByPointAccount;
	}

	public String getIBChargedFeeByPointCurrency() {
		return IBChargedFeeByPointCurrency;
	}

	public void setIBChargedFeeByPointCurrency(String iBChargedFeeByPointCurrency) {
		IBChargedFeeByPointCurrency = iBChargedFeeByPointCurrency;
	}

	public BigDecimal getMarginRate() {
		return marginRate;
	}

	public void setMarginRate(BigDecimal marginRate) {
		this.marginRate = marginRate;
	}

	public String getOpenGroup() {
		return openGroup;
	}

	public void setOpenGroup(String openGroup) {
		this.openGroup = openGroup;
	}

	public String getCloseGroup() {
		return closeGroup;
	}

	public void setCloseGroup(String closeGroup) {
		this.closeGroup = closeGroup;
	}

	public BigDecimal getAmountPerlot() {
		return amountPerlot;
	}

	public void setAmountPerlot(BigDecimal amountPerlot) {
		this.amountPerlot = amountPerlot;
	}

	public Integer getIsDelivery() {
		return isDelivery;
	}

	public void setIsDelivery(Integer isDelivery) {
		this.isDelivery = isDelivery;
	}
}

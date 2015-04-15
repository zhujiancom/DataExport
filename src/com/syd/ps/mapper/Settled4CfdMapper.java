package com.syd.ps.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.syd.ps.bean.Settled4Cfd;

public class Settled4CfdMapper implements RowMapper<Settled4Cfd> {

	@Override
	public Settled4Cfd mapRow(ResultSet set, int index) throws SQLException {
		Settled4Cfd sfd = new Settled4Cfd();
		sfd.setAccount(set.getLong("account"));
		sfd.setAmountPerlot(set.getBigDecimal("amountPerLot"));
		sfd.setBalanceCur(set.getString("balanceCur"));
		sfd.setBalanceRate(set.getBigDecimal("balanceRate"));
		sfd.setBuysell(set.getInt("buysell"));
		sfd.setCloseCommisionCurrency(set.getString("CloseCommision_currency"));
		sfd.setCloseGroup(set.getString("closeGroup"));
		sfd.setClosePrice(set.getBigDecimal("closePrice"));
		sfd.setCloseTime(set.getTimestamp("closeTime"));
		sfd.setCloseTradeDay(set.getString("closeTradeDay"));
		sfd.setCommision4close(set.getBigDecimal("Commision_4Close"));
		sfd.setCommision4open(set.getBigDecimal("Commision_4Open"));
		sfd.setCorderId(set.getLong("corderid"));
		sfd.setCosplitno(set.getInt("cosplitno"));
		sfd.setIBChargedFeeByPoint(set.getBigDecimal("IBChargedFeeByPoint"));
		sfd.setIBChargedFeeByPointAccount(set.getBigDecimal("IBChargedFeeByPoint_account"));
		sfd.setIBChargedFeeByPointCurrency(set.getString("IBChargedFeeByPoint_currency"));
		sfd.setIBChargedFeeByPointGroup(set.getBigDecimal("IBChargedFeeByPoint_group"));
		sfd.setIBChargedFeeByPointSystem(set.getBigDecimal("IBChargedFeeByPoint_system"));
		sfd.setInstrument(set.getString("instrument"));
		sfd.setIsDelivery(set.getInt("isDelivery"));
		sfd.setLots(set.getBigDecimal("lots"));
		sfd.setMarginRate(set.getBigDecimal("marginRate"));
		sfd.setOorderId(set.getLong("oorderid"));
		sfd.setOosplitno(set.getInt("oosplitno"));
		sfd.setOpenCommisionCurrency(set.getString("OpenCommision_currency"));
		sfd.setOpenGroup(set.getString("openGroup"));
		sfd.setOpenPrice(set.getBigDecimal("openprice"));
		sfd.setOpenTime(set.getTimestamp("opentime"));
		sfd.setOpenTradeDay(set.getString("openTradeDay"));
		sfd.setProfitloss(set.getBigDecimal("profitloss"));
		sfd.setReason(set.getInt("reason"));
		sfd.setRollover(set.getBigDecimal("rollover"));
		sfd.setSplitno(set.getInt("splitno"));
		sfd.setSubCommisionAccount4close(set.getBigDecimal("subCommision_account_4Close"));
		sfd.setSubCommisionAccount4open(set.getBigDecimal("subCommision_account_4open"));
		sfd.setSubCommisionGroup4close(set.getBigDecimal("subCommision_group_4Close"));
		sfd.setSubCommisionGroup4open(set.getBigDecimal("subCommision_group_4open"));
		sfd.setSubCommisionSystem4close(set.getBigDecimal("subCommision_System_4Close"));
		sfd.setSubCommisionSystem4open(set.getBigDecimal("subCommision_System_4open"));
		sfd.setTicket(set.getBigDecimal("ticket"));
		return sfd;
	}

}

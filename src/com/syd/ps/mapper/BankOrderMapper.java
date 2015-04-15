package com.syd.ps.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.syd.ps.bean.BankOrder;

public class BankOrderMapper implements RowMapper<BankOrder> {

	@Override
	public BankOrder mapRow(ResultSet set, int index) throws SQLException {
		BankOrder bo = new BankOrder();
		bo.setAccount(set.getLong("account"));
		bo.setAeid(set.getString("aeid"));
		bo.setAmount(set.getBigDecimal("amount"));
		bo.setAuditRemark(set.getString("auditRemark"));
		bo.setBankId(set.getString("bankID"));
		bo.setComment(set.getString("comment"));
		bo.setCurrency(set.getString("currency"));
		bo.setErrorCode(set.getString("errorCode"));
		bo.setErrorMsg(set.getString("errorMsg"));
		bo.setIpAddr(set.getString("ipAddr"));
		bo.setOrderId(set.getLong("orderID"));
		bo.setOrderTime(set.getTimestamp("orderTime"));
		bo.setOrigin(set.getString("origin"));
		bo.setState(set.getInt("state"));
		bo.setTradeDay(set.getString("tradeDay"));
		bo.setType(set.getString("type"));
		bo.setUserName(set.getString("userName"));
		return bo;
	}

}

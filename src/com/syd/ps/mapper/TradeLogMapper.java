package com.syd.ps.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.syd.ps.bean.TradeLog;

public class TradeLogMapper implements RowMapper<TradeLog> {

	@Override
	public TradeLog mapRow(ResultSet set, int index) throws SQLException {
		TradeLog trade = new TradeLog();
		trade.setAccount(set.getLong("account"));
		trade.setAction(set.getInt("action"));
		trade.setAeid(set.getString("aeid"));
		trade.setDescription(set.getString("description"));
		trade.setGuid(set.getString("guid"));
		trade.setIpAddress(set.getString("ipaddress"));
		trade.setLots(set.getBigDecimal("lots"));
		trade.setOperator(set.getString("operator"));
		trade.setOperatorRoleType(set.getInt("operatorroletype"));
		trade.setOrderid(set.getString("orderid"));
		trade.setTradeTime(set.getTimestamp("tradetime"));
		trade.setType(set.getInt("type"));
		return trade;
	}

}

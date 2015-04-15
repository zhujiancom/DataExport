package com.syd.ps.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.syd.ps.bean.UserProfile;

public class UserProfileMapper implements RowMapper<UserProfile> {

	@Override
	public UserProfile mapRow(ResultSet set, int index) throws SQLException {
		UserProfile user = new UserProfile();
		user.setAccount(set.getLong("account"));
		user.setAeid(set.getString("aeid"));
		user.setBankAcctName(set.getString("bankAcctName"));
		user.setBankAcctNo(set.getString("bankAcctNo"));
		user.setBankAcctType(set.getString("bankAcctType"));
		user.setBankCodeName(set.getString("bankCodeName"));
		user.setBankId(set.getString("bankId"));
		user.setBankOpenName(set.getString("bankOpenName"));
		user.setCertNo(set.getString("certNo"));
		user.setCertType(set.getInt("certType"));
		user.setCurrency(set.getString("currency"));
		user.setReserve1(set.getString("reserve1"));
		user.setReserve2(set.getString("reserve2"));
		user.setState(set.getInt("state"));
		user.setUpTime(set.getTimestamp("upTime"));
		user.setUserName(set.getString("userName"));
		user.setUserType(set.getInt("userType"));
		return user;
	}

}

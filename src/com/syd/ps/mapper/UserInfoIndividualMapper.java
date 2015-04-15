package com.syd.ps.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.syd.ps.bean.UserInfoIndividual;

public class UserInfoIndividualMapper implements RowMapper<UserInfoIndividual> {

	@Override
	public UserInfoIndividual mapRow(ResultSet set, int index)
			throws SQLException {
		UserInfoIndividual uii = new UserInfoIndividual();
		uii.setAddress(set.getString("Address"));
		uii.setAeid(set.getString("aeid"));
		uii.setBankAccount(set.getString("bankAccount"));
		uii.setBankName(set.getString("bankName"));
		uii.setBirthday(set.getString("birthday"));
		uii.setCellPhone(set.getString("cellPhone"));
		uii.setCity(set.getString("city"));
		uii.setDescription(set.getString("description"));
		uii.setEmail(set.getString("email"));
		uii.setExperience(set.getString("experience"));
		uii.setFax(set.getString("fax"));
		uii.setGender(set.getInt("gender"));
		uii.setLiveCountry(set.getString("liveCountry"));
		uii.setMsn(set.getString("MSN"));
		uii.setQq(set.getString("QQ"));
		return uii;
	}

}

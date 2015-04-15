package com.syd.ps.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.syd.ps.bean.TempList;

public class TempListMapper implements RowMapper<TempList> {

	@Override
	public TempList mapRow(ResultSet set, int index) throws SQLException {
		TempList result = new TempList(set.getLong("id"),set.getString("sCort"),set.getString("aeid"));
		return result;
	}

}

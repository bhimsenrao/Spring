package com.spr.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet result, int rows) throws SQLException {
		 
		return new Person(result.getInt(1),result.getString(2));
	}

}

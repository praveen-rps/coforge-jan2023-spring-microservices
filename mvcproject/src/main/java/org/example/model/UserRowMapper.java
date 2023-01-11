package org.example.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername(rs.getString(1));
		user.setPassword(rs.getString(2));
		System.out.println(rowNum);
		return user;
	}

}

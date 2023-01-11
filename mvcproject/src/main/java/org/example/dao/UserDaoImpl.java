package org.example.dao;

import java.util.List;

import org.example.model.User;
import org.example.model.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	JdbcTemplate template;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		
		return template.query("select * from user", new UserRowMapper());
		
		// on template object call the method to retrieve records from the database
		
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return template.update("insert into user values (?,?)",user.getUsername(), user.getPassword());
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		template.update("delete from user where username=?",user.getUsername());
		
	}

}

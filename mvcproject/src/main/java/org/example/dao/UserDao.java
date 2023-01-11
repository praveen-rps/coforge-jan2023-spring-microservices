package org.example.dao;

import java.util.List;

import org.example.model.User;

public interface UserDao {
	public List<User> getAllUsers();
	public int insertUser(User user);
	public void deleteUser(User user);
	// add methods for delete and update
	// add method for search 
}

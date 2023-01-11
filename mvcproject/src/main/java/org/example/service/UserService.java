package org.example.service;

import java.util.List;

import org.example.model.User;

public interface UserService {
	public List<User> getUsersFromDb();
	public int insertUser(User user);
}

package org.example.service;

import java.util.List;

import org.example.dao.UserDao;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao dao;

	@Override
	public List<User> getUsersFromDb() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

}

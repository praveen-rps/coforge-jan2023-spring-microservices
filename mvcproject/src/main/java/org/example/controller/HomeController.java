package org.example.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	UserService service;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/home")
	public ModelAndView home(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/register")
	public ModelAndView register(HttpServletResponse response) throws IOException{
		return new ModelAndView("register");
	}
	
	@RequestMapping(value="/search")
	public ModelAndView search(HttpServletResponse response) throws IOException{
		return new ModelAndView("search");
	}
	
	@RequestMapping(value="/test")
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		return new ModelAndView("test1");
	}
	
	@RequestMapping(value="/registerdata")
	public ModelAndView registerdata(HttpServletRequest request) throws IOException, ClassNotFoundException, SQLException{
		
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
	
		service.insertUser(new User(uname,passwd));
		return new ModelAndView("index");
	}
	
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest request) throws IOException, ClassNotFoundException, SQLException{
			
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		
		
		List<User> users = service.getUsersFromDb();
		boolean isFound=false;
		
		for(User usr:users) {
			if(usr.getUsername().equals(uname) && usr.getPassword().equals(passwd)) {
				isFound=true;
				break;
			}
		}
		if(isFound)
			return new ModelAndView("success");
		else
			return new ModelAndView("fail");
	}
}

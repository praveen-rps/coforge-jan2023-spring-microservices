package com.coforge.microservices.commentsservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.microservices.commentsservice.model.Comment;
import com.coforge.microservices.commentsservice.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService service;
	
	@Autowired
    Environment environment;
	
	@GetMapping("/port")
	public String getPort() {
		return environment.getProperty("local.server.port");
	}
	
	
	@GetMapping("/all")
	public List<Comment> findAllComments(){
		return service.findAllComments();
	}
	
	@GetMapping("/pid/{pid}")
	public List<Comment> findCommentsByPid(@PathVariable int pid){
		return service.findCommentsByPid(pid);
	}

}

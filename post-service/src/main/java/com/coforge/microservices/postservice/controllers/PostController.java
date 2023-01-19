package com.coforge.microservices.postservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.microservices.postservice.model.CommentsDto;
import com.coforge.microservices.postservice.model.Post;
import com.coforge.microservices.postservice.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	PostService service;
	
	@GetMapping("/all")
	public List<Post> findAllPosts(){
		return service.findAllPosts();
	}
	
	@GetMapping("/comment/{pid}")
	public List<CommentsDto> findCommentsByPid(@PathVariable int pid){
		return service.findCommentsByPostId(pid);
	}
	
	@GetMapping("/comment/port")
	public String getCommentServicePort() {
		return service.getCommentServicePort();
	}
	

}

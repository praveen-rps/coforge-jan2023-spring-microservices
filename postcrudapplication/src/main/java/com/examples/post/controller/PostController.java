package com.examples.post.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.post.model.Post;
import com.examples.post.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	PostService service;
	
	@GetMapping("/findByPid/{pid}")
	public Optional<Post> showAllByPid(@PathVariable("pid") String pid){
		return service.findByPostId(pid);
	}
	
	@GetMapping("/findByTitle/{title}")
	public List<Post> showAllByTitle(@PathVariable("title") String title){
		return service.findAllPostsByTitle(title);
	}
	
	@GetMapping("/find/{author}/{title}")
	public List<Post> showAllQuery(@PathVariable("author") String author, @PathVariable("title") String title){
		return service.findByOthers(author, title);
	}
	
	@GetMapping("/all")
	public List<Post> showAllPosts(){
		return service.getAllPosts();
	}
	
	@PostMapping("/add")
	public Post addPost(@RequestBody Post post) {
		return service.insertPost(post);
	}
}

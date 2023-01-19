package com.coforge.microservices.postservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coforge.microservices.postservice.model.CommentsDto;
import com.coforge.microservices.postservice.model.Post;
import com.coforge.microservices.postservice.repo.PostRepo;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostRepo repo;
	
	@Autowired
	PostFeignProxy proxy;
	
	@Autowired
	RestTemplate template;

	@Override
	public List<Post> findAllPosts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<CommentsDto> findCommentsByPostId(int pid) {
		// TODO Auto-generated method stub
		//return proxy.findCommentsByPid(pid);
		return template.getForObject("http://localhost:9900/comments/pid/"+pid, List.class);
		
	}

	@Override
	public String getCommentServicePort() {
		// TODO Auto-generated method stub
		return proxy.getCommentsPort();
		

	}

}

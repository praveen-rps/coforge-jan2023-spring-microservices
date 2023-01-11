package com.examples.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.post.dao.PostDao;
import com.examples.post.model.Post;


@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	PostDao dao;

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Post insertPost(Post post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}

}

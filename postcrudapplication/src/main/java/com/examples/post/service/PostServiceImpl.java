package com.examples.post.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Post> findAllPostsByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.findByTitle(title);
	}

	@Override
	public Optional<Post> findByPostId(String pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}

	@Override
	public List<Post> findByOthers(String author, String title) {
		// TODO Auto-generated method stub
		return dao.getPostsByAuthorNTitle(author, title);
	}

	

}

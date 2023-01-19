package com.coforge.microservices.commentsservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.microservices.commentsservice.model.Comment;
import com.coforge.microservices.commentsservice.repo.CommentRepo;


@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepo repo;
	
	
	
	
	@Override
	public List<Comment> findAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public List<Comment> findCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		return repo.findCommentsByPid(pid);
	}

}

package com.coforge.microservices.commentsservice.service;
import java.util.List;
import com.coforge.microservices.commentsservice.model.Comment;



public interface CommentService {
	
	public List<Comment> findAllComments();
	public List<Comment> findCommentsByPid(int pid);

}

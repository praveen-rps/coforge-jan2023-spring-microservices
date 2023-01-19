package com.coforge.microservices.commentsservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coforge.microservices.commentsservice.model.Comment;


@Repository
public interface CommentRepo extends JpaRepository<Comment,Integer>{
	
	
	@Query("select u from Comment u where u.pid=?1")
	public List<Comment> findCommentsByPid(int pid);
}
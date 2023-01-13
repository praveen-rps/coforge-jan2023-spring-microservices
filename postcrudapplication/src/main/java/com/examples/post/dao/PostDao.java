package com.examples.post.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examples.post.model.Post;


@Repository
public interface PostDao extends JpaRepository<Post,String>{
	
	public List<Post> findByTitle(String title);
	
	@Query("select p from Post p where p.author=?1 and p.title=?2")
	public List<Post> getPostsByAuthorNTitle(String author, String title);
}

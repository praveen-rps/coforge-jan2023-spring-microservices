package com.examples.post.service;

import java.util.List;
import java.util.Optional;

import com.examples.post.model.Post;

public interface PostService {
	public List<Post> getAllPosts();
	public Post insertPost(Post post);
	public List<Post> findAllPostsByTitle(String title);
	public Optional<Post> findByPostId(String pid);
	public List<Post> findByOthers(String author, String title);
}

package com.examples.post.service;

import java.util.List;

import com.examples.post.model.Post;

public interface PostService {
	public List<Post> getAllPosts();
	public Post insertPost(Post post);
}

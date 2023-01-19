package com.coforge.microservices.postservice.service;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.microservices.postservice.model.CommentsDto;

@FeignClient(name="comment-service")
public interface PostFeignProxy {

	@GetMapping("/comment/pid/{pid}")
	public List<CommentsDto> findCommentsByPid(@PathVariable int pid);
	
	@GetMapping("/comment/port")
	public String getCommentsPort();
}

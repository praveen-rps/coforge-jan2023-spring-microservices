package com.coforge.microservices.postservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="post")
public class Post {
	
	@Id
	private int pid;
	
	private String author;
	
	public Post(int pid, String author, String description, String title) {
		super();
		this.pid = pid;
		this.author = author;
		this.description = description;
		this.title = title;
	}

	private String description;
	
	private String title;
	
	public Post() {
		
	}
	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}

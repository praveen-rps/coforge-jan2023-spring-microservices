package com.examples.post.model;

import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(appliesTo = "post")

public class Post {
	
	
	@Id
	String pid;
	
	@Column(name="author")
	String author;
	
	@Column
	String title;
	
	@Column
	String description;
	public Post() {
		
	}
	
	public Post(String pid, String author, String title, String description) {
		super();
		this.pid = pid;
		this.author = author;
		this.title = title;
		this.description = description;
	}


	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

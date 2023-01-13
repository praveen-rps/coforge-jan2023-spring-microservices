package com.examples.post.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PostConfigurations {
	
	@Bean
	@Profile("local1")
	  public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer1() {
	    PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
	    properties.setLocation(new FileSystemResource("d://data/local1.properties"));
	    properties.setIgnoreResourceNotFound(false);
	    return properties;
	  }
	
	
	@Bean
	@Profile("local2")
	  public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer2() {
	    PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
	    properties.setLocation(new FileSystemResource("d://data/local2.properties"));
	    properties.setIgnoreResourceNotFound(false);
	    return properties;
	  }
}

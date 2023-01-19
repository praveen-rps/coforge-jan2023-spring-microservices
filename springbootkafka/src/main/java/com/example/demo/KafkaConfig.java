package com.example.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
	
	@Bean
	public NewTopic kafkaguidesTopic(){
        return TopicBuilder.name(AppConstants.TOPIC_NAME)
                .build();
    }

}

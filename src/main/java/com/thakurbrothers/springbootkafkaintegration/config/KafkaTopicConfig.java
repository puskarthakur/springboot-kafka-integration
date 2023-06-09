package com.thakurbrothers.springbootkafkaintegration.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic thakurbrothersTopic() {
		return TopicBuilder.name("thakurbrothers")
				.build();
	}
	
	@Bean
	public NewTopic thakurbrothersJsonTopic() {
		return TopicBuilder.name("thakurbrothers_json")
				.build();
	}
}

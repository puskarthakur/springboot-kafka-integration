package com.thakurbrothers.springbootkafkaintegration.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.thakurbrothers.springbootkafkaintegration.dto.User;

@Service
public class JsonKafkaConsumer {
	public static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics = "thakurbrothers_json", groupId = "myGroup")
	public void consume(User user) {
		LOGGER.info(String.format("JSON Message recived -> %s", user.toString()));
	}
}

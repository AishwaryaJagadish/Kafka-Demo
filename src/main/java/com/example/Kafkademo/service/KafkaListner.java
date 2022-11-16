package com.example.Kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {
	@KafkaListener(topics = "MainTopic", groupId = "group1")
	public void listenToCodeDecodeKafkaTopic(String messageReceived) {
		System.out.println("Message received is " + messageReceived);
	}

}

package com.example.coursesmanagerkata.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "racingTopic", groupId = "example_group")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }

}

package com.example.coursesmanagerkata.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic exampleTopic() {
        return new NewTopic("racingTopic", 1, (short) 1);
    }

}

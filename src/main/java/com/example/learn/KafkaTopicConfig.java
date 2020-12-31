package com.example.learn;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic topic1() {
        return new NewTopic("swati", 1, (short) 1);
    }
}

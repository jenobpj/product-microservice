package com.example.ProductMicroservice.Product_Microservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic createNewTopic(){
        return new NewTopic("javaKafka",5,(short) 1);
    }
}

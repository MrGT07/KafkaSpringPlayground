package com.example.kafka.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Yash Patel
 * @since 26/08/25 04:28 PM
 */
@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consume(String message) {
        log.info("Consumed message: " + message);
    }
}

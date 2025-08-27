package com.example.kafka.service;


import com.example.kafka.response.MessageResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public void consume(String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        MessageResponse messageResponse = objectMapper.readValue(message, MessageResponse.class);
        log.info("Consumed message: " + messageResponse.toString());
    }
}

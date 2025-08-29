package com.example.kafka.service;


import com.example.kafka.avro.Message;
import com.example.kafka.response.MessageResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Yash Patel
 * @since 26/08/25 04:28 PM
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {

    private static final String TOPIC = "test_topic";

    private final KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(Message message) {
        kafkaTemplate.send(TOPIC, message);
        log.info("Sent message: " + message + " to topic: " + TOPIC);
    }

}

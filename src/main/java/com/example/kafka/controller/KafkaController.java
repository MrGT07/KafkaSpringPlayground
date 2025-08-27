package com.example.kafka.controller;


import com.example.kafka.response.MessageResponse;
import com.example.kafka.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Yash Patel
 * @since 26/08/25 04:28 PM
 */
@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody MessageResponse message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent to Kafka topic";
    }
}

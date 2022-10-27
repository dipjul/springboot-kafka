package com.dipjul.springbootkafka.controller;

import com.dipjul.springbootkafka.kafka.JsonKafkaProducer;
import com.dipjul.springbootkafka.kafka.KafkaProducer;
import com.dipjul.springbootkafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka/jsonMessage")
public class JsonMessageController {

    @Autowired
    JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Message sent to the topic");
    }
}

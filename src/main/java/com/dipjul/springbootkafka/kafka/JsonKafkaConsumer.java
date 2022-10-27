package com.dipjul.springbootkafka.kafka;

import com.dipjul.springbootkafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "sampleJsonTopic", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Message received -> %s", user.toString()));
    }
}

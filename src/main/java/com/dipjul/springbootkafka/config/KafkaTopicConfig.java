package com.dipjul.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic sampleTopic() {
        return TopicBuilder.name("sampleTopic")
                .build();
    }

    @Bean
    public NewTopic sampleJsonTopic() {
        return TopicBuilder.name("sampleJsonTopic")
                .build();
    }
}

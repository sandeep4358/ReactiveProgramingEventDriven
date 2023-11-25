package com.javafruit.SpringReactiveProgramming.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Created date 26-11-2023
 */
@Configuration
@Slf4j
public class KafkaTopicConfig {
    @Value("${ska.kafka.topic.name.1}")
    private String topicName1;
    @Bean
    public NewTopic topic(){
        /**(
         * Below we can provide the Topic configuration here in the kafka topic.
         */
      log.info("SKA : >> "+ topicName1);
        return TopicBuilder.name(topicName1).build();
    }
}

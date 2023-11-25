package com.javafruit.SpringReactiveProgramming.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Below is the producer of the kafka.
 */
@Service
@Slf4j
public class KafkaProducer {
    //To send the message to the topic we are gonna use the spring provided KafkaTemplate.
    @Value("${ska.kafka.topic.name.1}")
    private String topicName1;
    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        log.info("SKA : message :: "+message);
        kafkaTemplate.send(topicName1, message);
    }

}

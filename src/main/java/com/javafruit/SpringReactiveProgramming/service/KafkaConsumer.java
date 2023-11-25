package com.javafruit.SpringReactiveProgramming.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @Value("${ska.kafka.topic.name.1}")
    private String topicName1;
    @KafkaListener(topics = "skaTopic1",groupId = "myGroup")
    public void consume(String message){
      log.info("SKA :: >> Message received: "+message );


    }

}

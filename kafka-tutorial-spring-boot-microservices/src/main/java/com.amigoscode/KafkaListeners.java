package com.amigoscode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "planning-events-topic-BR", groupId = "groupId1")
    void listener1(String data) {
        System.out.println("Planning Events Listener received: " + data + ". Yay!");
    }

//    @KafkaListener(topics = "projector-events-topic-BR", groupId = "groupId1")
//    void listener2(String data) {
//        System.out.println("Projector Events Listener received: " + data + ". Yay!");
//    }
}

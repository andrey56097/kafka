package com.example.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics="msg")
    public void msgListener(String msg){
        System.out.println(msg);
    }
}

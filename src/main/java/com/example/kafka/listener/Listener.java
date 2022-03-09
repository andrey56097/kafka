package com.example.kafka.listener;

import com.example.kafka.dto.UserDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics="msg")
    public void orderListener(ConsumerRecord<Long, UserDto> record){
        System.out.println(record.partition());
        System.out.println(record.key());
        System.out.println(record.value());
    }
}

package com.example.school.service;

import com.example.school.domain.StudentTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "school_update", groupId = "notification_group")
    public void listenGroupFoo(StudentTO message) {
        System.out.println("Received Message: " + message);
    }
}

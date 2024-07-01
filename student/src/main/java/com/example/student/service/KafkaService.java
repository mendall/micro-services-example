package com.example.student.service;

import com.example.student.domain.StudentTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * The KafkaService class is responsible for sending school update messages to Kafka.
 */
@Service
@RequiredArgsConstructor
public class KafkaService {

    private final KafkaTemplate<String, StudentTO> kafkaTemplate;

    public void updateSchoolData(StudentTO message){
        this.kafkaTemplate.send("school_update", message);
    }
}

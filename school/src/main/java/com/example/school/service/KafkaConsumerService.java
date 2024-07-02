package com.example.school.service;

import com.example.school.domain.StudentTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * This class is responsible for consuming messages from a Kafka topic and updating the students count in the school service.
 * It listens to messages from the "school_update" topic and when a message is received, it calls the {@link SchoolService#updateStudentsCount(Long)} method to update the students
 *  count in the school service.
 */
@Service
@Slf4j
@AllArgsConstructor
public class KafkaConsumerService {

    private final SchoolService schoolService;

    @KafkaListener(topics = "school_update", groupId = "notification_group")
    public void studentAddedEventListener(StudentTO student) {
        log.info("Received Message: %s ".formatted(student));
        schoolService.updateStudentsCount(student.schoolId());
    }
}

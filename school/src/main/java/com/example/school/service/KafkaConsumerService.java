package com.example.school.service;

import com.example.school.domain.StudentTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class KafkaConsumerService {

    private final SchoolService schoolService;

    @KafkaListener(topics = "school_update", groupId = "notification_group")
    public void studentAddedEventListener(StudentTO student) {
        log.debug("Received Message: %s ".formatted(student));
        schoolService.updateStudentsCount(student.schoolId());
    }
}

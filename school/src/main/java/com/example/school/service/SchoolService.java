package com.example.school.service;

import com.example.school.repository.entity.School;
import com.example.school.domain.SchoolInfo;
import com.example.school.client.StudentClient;
import com.example.school.exception.EntityNotFoundException;
import com.example.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

/**
 * The SchoolService class provides methods for managing school data, such as saving schools,
 * retrieving all schools, retrieving a school with its students, and updating the number of students in a school.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public void save(School school) {
        schoolRepository.save(school);

        log.info("School with id: {} and name: {} has been saved successfully.", school.getId(), school.getName());
    }

    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    public SchoolInfo findSchoolWithStudents(Long schoolId) {
        School school = schoolRepository.findById(schoolId).orElseThrow(() -> new EntityNotFoundException(String.format("School with id %s not found", schoolId)));
        return SchoolInfo.builder()
                .students(studentClient.getStudents(schoolId))
                .email(school.getEmail())
                .name(school.getName())
                .build();
    }

    /**
     * Handles the EntityNotFoundException and returns a ResponseEntity with the appropriate status code
     * and error message.
     *
     * @param ex the EntityNotFoundException that was thrown
     * @return a ResponseEntity containing the error message with HTTP status code 404 (Not Found)
     */
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleEntityNotFoundException(EntityNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    public void updateStudentsCount(Long schoolId) {
        schoolRepository.findById(schoolId).ifPresent(school ->
                schoolRepository.updateStudentsCount(school.getId()));
    }
}

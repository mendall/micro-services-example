package com.example.school.controller;

import com.example.school.domain.SchoolInfo;
import com.example.school.domain.SchoolTO;
import com.example.school.mapper.SchoolMapper;
import com.example.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The SchoolController class is responsible for handling HTTP requests related to schools.
 * It exposes endpoints for creating a new school, retrieving all schools, and retrieving a school with its students.
 */
@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSchool(@RequestBody SchoolTO schoolTO) {
        schoolService.save(SchoolMapper.INSTANCE.getSchool(schoolTO));
    }

    @GetMapping
    public ResponseEntity<List<SchoolTO>> getAllSchools() {
        return ResponseEntity.ok(SchoolMapper.INSTANCE.getSchoolTOs(schoolService.findAll()));
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<SchoolInfo> getSchoolById(@PathVariable("school-id") Long schoolId) {
        return ResponseEntity.ok(schoolService.findSchoolWithStudents(schoolId));
    }

}

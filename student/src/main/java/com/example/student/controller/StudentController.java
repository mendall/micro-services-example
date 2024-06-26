package com.example.student.controller;

import com.example.student.domain.StudentTO;
import com.example.student.mapper.StudentMapper;
import com.example.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentTO studentTO) {

        studentService.save(StudentMapper.INSTANCE.getStudent(studentTO));
    }

    @GetMapping
    public ResponseEntity<List<StudentTO>> getAllStudents() {

        return ResponseEntity.ok(StudentMapper.INSTANCE.getStudentTOs(studentService.findAll()));
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<StudentTO>> findStudentsBySchoolId(@PathVariable("school-id") Long schoolId) {

        return ResponseEntity.ok(StudentMapper.INSTANCE.getStudentTOs(studentService.finaAllBySchoolId(schoolId)));
    }
}

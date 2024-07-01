package com.example.student.service;

import com.example.student.domain.StudentTO;
import com.example.student.mapper.StudentMapper;
import com.example.student.repository.entity.Student;
import com.example.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The StudentService class is responsible for providing CRUD operations for Student data.
 * It interacts with the StudentRepository to perform database operations and with the KafkaService to update school data in Kafka.
 */
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final KafkaService kafkaService;

    public void save(StudentTO studentTO) {
        studentRepository.save(StudentMapper.INSTANCE.getStudent(studentTO));
        kafkaService.updateSchoolData(studentTO);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public List<Student> finaAllBySchoolId(Long schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}

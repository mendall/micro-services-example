package com.example.student.service;

import com.example.student.domain.StudentTO;
import com.example.student.mapper.StudentMapper;
import com.example.student.repository.entity.Student;
import com.example.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

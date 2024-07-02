package com.example.student.service;

import com.example.student.domain.StudentTO;
import com.example.student.mapper.StudentMapper;
import com.example.student.repository.StudentRepository;
import com.example.student.repository.entity.Student;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class StudentServiceTest {
    @Mock
    private StudentRepository studentRepository;
    @Mock
    private KafkaService kafkaService;

    @InjectMocks
    private StudentService studentService;

//    @Test
//    public void saveGreenPath() {
//        // given
//        StudentTO studentTO = Mockito.mock(StudentTO.class);
//        Student student = StudentMapper.INSTANCE.getStudent(studentTO);
//
//        when(studentRepository.save(student)).thenReturn(student);
//
//        // when
//        studentService.save(studentTO);
//
//        // then
//        verify(studentRepository).save(student);
//        verify(kafkaService).updateSchoolData(studentTO);
//    }
//
//    @Test
//    public void findAllGreenPath() {
//        List<Student> students = new ArrayList<>();
//        when(studentRepository.findAll()).thenReturn(students);
//
//        List<Student> result = studentService.findAll();
//
//        verify(studentRepository).findAll();
//        assertThat(result).isSameAs(students);
//    }
//
//    @Test
//    public void finaAllBySchoolIdGreenPath() {
//        Long schoolId = 1L;
//        List<Student> students = new ArrayList<>();
//        when(studentRepository.findAllBySchoolId(schoolId)).thenReturn(students);
//
//        List<Student> result = studentService.finaAllBySchoolId(schoolId);
//
//        verify(studentRepository).findAllBySchoolId(schoolId);
//        assertThat(result).isSameAs(students);
//    }
//
//    @Test
//    public void findAllBySchoolIdGreenPath() {
//        // given
//        Long schoolId = 1L;
//        List<Student> students = new ArrayList<>();
//        when(studentRepository.findAllBySchoolId(schoolId)).thenReturn(students);
//
//        // when
//        List<Student> result = studentService.finaAllBySchoolId(schoolId);
//
//        // then
//        verify(studentRepository).findAllBySchoolId(schoolId);
//        assertThat(result).isSameAs(students);
//    }
//
//    @Test
//    public void findAllBySchoolIdRedPath() {
//        Long schoolId = 1L;
//        when(studentRepository.findAllBySchoolId(schoolId)).thenReturn(null);
//
//        List<Student> result = studentService.finaAllBySchoolId(schoolId);
//
//        verify(studentRepository).findAllBySchoolId(schoolId);
//        assertThat(result).isNull();
//    }
//
//    @Test
//    public void saveRedPath() {
//        StudentTO studentTO = Mockito.mock(StudentTO.class);
//        Student student = StudentMapper.INSTANCE.getStudent(studentTO);
//
//        when(studentRepository.save(student)).thenReturn(null);
//
//        studentService.save(studentTO);
//
//        verify(studentRepository).save(student);
//        verify(kafkaService, never()).updateSchoolData(studentTO);
//    }
}

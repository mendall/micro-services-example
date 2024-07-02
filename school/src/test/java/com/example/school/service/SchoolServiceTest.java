package com.example.school.service;

import com.example.school.repository.entity.School;
import com.example.school.repository.SchoolRepository;
import com.example.school.exception.EntityNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class SchoolServiceTest {

    @Mock
    private SchoolRepository schoolRepository;

    @InjectMocks
    private SchoolService schoolService;

//    @Test
//    public void saveSchoolGreenPath() {
//        School schoolToSave = new School();
//        schoolToSave.setName("Test school");
//        schoolToSave.setEmail("test.school@email.com");
//
//        Mockito.doNothing().when(schoolRepository).save(Mockito.any(School.class));
//
//        schoolService.save(schoolToSave);
//
//        Mockito.verify(schoolRepository, Mockito.times(1)).save(schoolToSave);
//    }

//    @Test
//    public void updateStudentsCountGreenPath() {
//        Long schoolId = 1L;
//
//        Mockito.doNothing().when(schoolRepository).updateStudentsCount(Mockito.anyLong());
//
//        schoolService.updateStudentsCount(schoolId);
//
//        Mockito.verify(schoolRepository, Mockito.times(1)).updateStudentsCount(schoolId);
//    }

//    @Test
//    public void findAllSchoolsGreenPath() {
//        List<School> expectedSchools = new ArrayList<>();
//        expectedSchools.add(new School());
//        expectedSchools.add(new School());
//
//        Mockito.when(schoolRepository.findAll()).thenReturn(expectedSchools);
//
//        List<School> actualSchools = schoolService.findAll();
//
//        Assertions.assertEquals(expectedSchools, actualSchools);
//    }

//    @Test
//    public void findSchoolWithStudentsGreenPath() {
//        Long schoolId = 1L;
//        SchoolInfo expectedSchoolInfo = new SchoolInfo();
//
//        Mockito.when(schoolRepository.findSchoolWithStudents(schoolId)).thenReturn(expectedSchoolInfo);
//
//        SchoolInfo actualSchoolInfo = schoolService.findSchoolWithStudents(schoolId);
//
//        Assertions.assertEquals(expectedSchoolInfo, actualSchoolInfo);
//    }

//    @Test
//    public void saveSchoolGreenPath() {
//        School schoolToSave = new School();
//        schoolToSave.setName("Test school");
//        schoolToSave.setEmail("test.school@email.com");
//
//        Mockito.doNothing().when(schoolRepository).save(Mockito.any(School.class));
//
//        schoolService.save(schoolToSave);
//
//        Mockito.verify(schoolRepository, Mockito.times(1)).save(schoolToSave);
//    }

//    @Test
//    public void handleEntityNotFoundExceptionGreenPath() {
//        EntityNotFoundException ex = new EntityNotFoundException();
//        ResponseEntity<String> expectedResponse = ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entity not found");
//
//        ResponseEntity<String> actualResponse = schoolService.handleEntityNotFoundException(ex);
//
//        Assertions.assertEquals(expectedResponse, actualResponse);
//    }

}
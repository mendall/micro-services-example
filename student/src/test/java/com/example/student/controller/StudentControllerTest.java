package com.example.student.controller;

import com.example.student.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService studentService;

//    @Test
//    void createStudentGreenPath() throws Exception {
//        StudentTO studentTO = StudentTO.builder().build();
//
//        String studentJson = "{ }";
//
//        mockMvc.perform(post("/api/v1/students")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(studentJson))
//                .andExpect(status().isCreated());
//
//        verify(studentService, times(1)).save(studentTO);
//    }

//    @Test
//    void getAllStudentsGreenPath() throws Exception {
//        List<Student> students = Arrays.asList(
//                Student.builder().id(1L).name("John").build(),
//                Student.builder().id(2L).name("Jane").build()
//        );
//
//        when(studentService.findAll()).thenReturn(students);
//
//        mockMvc.perform(get("/api/v1/students"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(2)))
//                .andExpect(jsonPath("$[0].id", is(1)))
//                .andExpect(jsonPath("$[0].name", is("John")))
//                .andExpect(jsonPath("$[1].id", is(2)))
//                .andExpect(jsonPath("$[1].name", is("Jane")));
//
//        verify(studentService, times(1)).findAll();
//    }

//    @Test
//    void getAllStudentsBySchoolIdGreenPath() throws Exception {
//        Long schoolId = 1L;
//        List<Student> students = Arrays.asList(
//                Student.builder().id(1L).name("John").build(),
//                Student.builder().id(2L).name("Jane").build()
//        );
//
//        when(studentService.findAllBySchoolId(schoolId)).thenReturn(students);
//
//        mockMvc.perform(get("/api/v1/students")
//                        .param("schoolId", String.valueOf(schoolId)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(2)))
//                .andExpect(jsonPath("$[0].id", is(1)))
//                .andExpect(jsonPath("$[0].name", is("John")))
//                .andExpect(jsonPath("$[1].id", is(2)))
//                .andExpect(jsonPath("$[1].name", is("Jane")));
//
//        verify(studentService, times(1)).findAllBySchoolId(schoolId);
//    }


//    @Test
//    void getAllStudentsBySchoolIdNotFound() throws Exception {
//        Long schoolId = 1L;
//
//        when(studentService.finaAllBySchoolId(schoolId)).thenReturn(Collections.emptyList());
//
//        mockMvc.perform(get("/api/v1/students")
//                        .param("schoolId", String.valueOf(schoolId)))
//                .andExpect(status().isNotFound());
//
//        verify(studentService, times(1)).finaAllBySchoolId(schoolId);
//    }

}
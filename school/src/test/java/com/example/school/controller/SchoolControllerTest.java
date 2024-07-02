package com.example.school.controller;

import com.example.school.service.SchoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(SchoolController.class)
@Slf4j
public class SchoolControllerTest {


    @Autowired
    MockMvc mockMvc;

    @MockBean
    SchoolService schoolService;

//    @Test
//    public void testGetAllSchools() throws Exception {
//        SchoolTO schoolTO = new SchoolTO();
//        schoolTO.setId(1L);
//        schoolTO.setName("Test School");
//        List<SchoolTO> schoolTOList = Collections.singletonList(schoolTO);
//        when(schoolService.findAll()).thenReturn(schoolTOList);
//
//        mockMvc.perform(get("/api/v1/schools"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$", hasSize(1)))
//                .andExpect(jsonPath("$[0].name", is(schoolTO.getName())));
//    }

//    @Test
//    public void testGetSchoolWithStudents() throws Exception {
//        Long schoolId = 1L;
//        SchoolInfo schoolInfo = new SchoolInfo();
//        schoolInfo.setId(schoolId);
//        schoolInfo.setName("Test School");
//        List<Student> students = Arrays.asList(new Student("John"), new Student("Jane"));
//        schoolInfo.setStudents(students);
//        when(schoolService.findSchoolWithStudents(schoolId)).thenReturn(schoolInfo);
//
//        mockMvc.perform(get("/api/v1/schools/{schoolId}", schoolId))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id", is(schoolInfo.getId().intValue())))
//                .andExpect(jsonPath("$.name", is(schoolInfo.getName())))
//                .andExpect(jsonPath("$.students", hasSize(2)))
//                .andExpect(jsonPath("$.students[0].name", is(students.get(0).getName())))
//                .andExpect(jsonPath("$.students[1].name", is(students.get(1).getName())));
//    }


}
package com.example.school.client;

import com.example.school.domain.StudentTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping("/school/{school-id}")
    List<StudentTO> getStudents(@PathVariable("school-id") Long schoolId);
}

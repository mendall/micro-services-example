package com.example.student.mapper;

import com.example.student.domain.StudentTO;
import com.example.student.repository.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

  StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

  Student getStudent(StudentTO studentTO);

  List<StudentTO> getStudentTOs(Iterable<Student> students);

}

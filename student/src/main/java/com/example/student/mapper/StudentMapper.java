package com.example.student.mapper;

import com.example.student.domain.StudentTO;
import com.example.student.repository.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * The StudentMapper interface is responsible for mapping between Student and StudentTO objects.
 * It uses MapStruct library for automatic generation of the mapping code.
 * It provides methods to convert a StudentTO object to a Student object and a
 * collection of Student objects to a list of StudentTO objects.
 */
@Mapper(componentModel = "spring")
public interface StudentMapper {

  StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

  Student getStudent(StudentTO studentTO);

  List<StudentTO> getStudentTOs(Iterable<Student> students);

}

package com.example.school.mapper;

import com.example.school.domain.SchoolTO;
import com.example.school.repository.entity.School;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * The SchoolMapper interface is responsible for mapping School entities to SchoolTO
 * and vice versa. It uses MapStruct library for automatic generation of the mapping code.
 * It provides methods to convert a SchoolTO object to a School object and a
 * collection of School objects to a list of SchoolTO objects.
 */
@Mapper(componentModel = "spring")
public interface SchoolMapper {

  SchoolMapper INSTANCE = Mappers.getMapper(SchoolMapper.class);

  School getSchool(SchoolTO schoolTO);

  List<SchoolTO> getSchoolTOs(Iterable<School> schools);

}

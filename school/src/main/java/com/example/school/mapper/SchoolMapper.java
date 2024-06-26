package com.example.school.mapper;

import com.example.school.domain.SchoolTO;
import com.example.school.repository.entity.School;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SchoolMapper {

  SchoolMapper INSTANCE = Mappers.getMapper(SchoolMapper.class);

  School getSchool(SchoolTO schoolTO);

  List<SchoolTO> getSchoolTOs(Iterable<School> schools);

}

package com.datnguyen.student.mapper;

import com.datnguyen.student.dto.request.StudentRequestDTO;
import com.datnguyen.student.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper extends BaseMapper<StudentRequestDTO, Student> {
}

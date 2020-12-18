package com.datnguyen.student.service;

import com.datnguyen.student.dto.request.StudentRequestDTO;
import com.datnguyen.student.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student findStudentById(Long id);

    Student create(StudentRequestDTO studentRequestDTO);

    Long delete(Long id);

    Student update(StudentRequestDTO studentRequestDTO);

}

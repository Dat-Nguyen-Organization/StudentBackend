package com.datnguyen.student.service.impl;

import com.datnguyen.student.dto.request.StudentRequestDTO;
import com.datnguyen.student.entity.Student;
import com.datnguyen.student.mapper.StudentMapper;
import com.datnguyen.student.repository.StudentRepository;
import com.datnguyen.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student findStudentById(Long id) {
        return null;
    }

    @Override
    public Student create(StudentRequestDTO studentRequestDTO) {
        Student student = this.studentMapper.dtoToEntity(studentRequestDTO);
        return this.studentRepository.save(student);
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public Student update(StudentRequestDTO studentRequestDTO) {
        return null;
    }
}

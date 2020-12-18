package com.datnguyen.student.controller;

import com.datnguyen.student.constants.NameConstants;
import com.datnguyen.student.dto.request.StudentRequestDTO;
import com.datnguyen.student.entity.Student;
import com.datnguyen.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(NameConstants.API_VERSION + "/students")
@AllArgsConstructor
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(this.studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Student> createStudent(@RequestBody @Valid StudentRequestDTO studentRequestDTO) {
        return new ResponseEntity<>(this.studentService.create(studentRequestDTO), HttpStatus.OK);
    }
}

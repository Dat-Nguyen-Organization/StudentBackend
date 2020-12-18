package com.datnguyen.student.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponseDTO {
    private Long id;
    private Long code;
    private String className;
    private Double averageMark;
}

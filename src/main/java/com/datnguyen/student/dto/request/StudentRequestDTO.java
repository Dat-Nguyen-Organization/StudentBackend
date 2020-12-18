package com.datnguyen.student.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class StudentRequestDTO {

    private Long id;

    @Min(value = 0000)
    @Max(value = 9999)
    private Long code;

    private String className;

    private Double averageMark;
}

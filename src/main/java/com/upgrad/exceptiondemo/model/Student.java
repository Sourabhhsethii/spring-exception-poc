package com.upgrad.exceptiondemo.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Data
@Builder
public class Student {

    private String studentId;

    @NotBlank(message = "Student Name cannot be blank")
    @Size(min = 5, max = 20, message = "Student Name length should be between 5 and 20 Characters")
    private String studentName;

    private String studentDob;

    @NotBlank(message = "Mobile number cannot be Black")
    private String mobile;

}

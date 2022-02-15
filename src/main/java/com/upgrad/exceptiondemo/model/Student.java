package com.upgrad.exceptiondemo.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Student {

    private String studentId;
    private String studentName;
    private String studentDob;
    private String mobile;

}

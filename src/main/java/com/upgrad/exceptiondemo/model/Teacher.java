package com.upgrad.exceptiondemo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Teacher {
    private String teacherId;
    private String teacherName;

}

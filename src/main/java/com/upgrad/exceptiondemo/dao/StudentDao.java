package com.upgrad.exceptiondemo.dao;

import com.upgrad.exceptiondemo.model.Student;

import java.util.List;

public interface StudentDao {
    Student findByStudentId(String studentId);

    List<Student> findAll();
}

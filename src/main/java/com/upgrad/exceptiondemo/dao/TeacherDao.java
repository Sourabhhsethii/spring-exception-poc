package com.upgrad.exceptiondemo.dao;

import com.upgrad.exceptiondemo.model.Teacher;

public interface TeacherDao {
    public Teacher findByTeacherId(String teacherId);
}

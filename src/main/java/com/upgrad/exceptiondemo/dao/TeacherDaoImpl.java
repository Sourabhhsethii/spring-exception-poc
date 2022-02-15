package com.upgrad.exceptiondemo.dao;

import com.upgrad.exceptiondemo.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class TeacherDaoImpl implements TeacherDao{
    @Override
    public Teacher findByTeacherId(String teacherId) {
                return Arrays.asList(
                                Teacher.builder().teacherId("1").teacherName("Manish").build(),
                                Teacher.builder().teacherId("2").teacherName("Suresh").build()
                        ).stream()
                        .filter(s -> s.getTeacherId().equals(teacherId))
                        .findFirst()
                        .get();


    }
}

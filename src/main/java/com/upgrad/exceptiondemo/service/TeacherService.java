package com.upgrad.exceptiondemo.service;

import com.upgrad.exceptiondemo.dao.TeacherDao;
import com.upgrad.exceptiondemo.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TeacherService {

    private final TeacherDao teacherDao;
    public Teacher getTeacher(String teacherId) {
        return teacherDao.findByTeacherId(teacherId);
    }
}

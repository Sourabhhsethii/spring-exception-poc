package com.upgrad.exceptiondemo.service;

import com.upgrad.exceptiondemo.dao.StudentDao;
import com.upgrad.exceptiondemo.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentDao dao;

    public Student getStudent(String studentId) {
        return dao.findByStudentId(studentId);
    }

    public List<Student> getAllStudents() {
        return dao.findAll();
    }

    public Student save(Student student) {
        return student;
    }
}

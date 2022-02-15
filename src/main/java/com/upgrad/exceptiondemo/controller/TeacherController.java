package com.upgrad.exceptiondemo.controller;

import com.upgrad.exceptiondemo.model.Teacher;
import com.upgrad.exceptiondemo.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
public class TeacherController {

    private final TeacherService service;

    @GetMapping("/v1/teachers/{teacherId}")
    public ResponseEntity<Teacher> getTeacher(@PathVariable String teacherId){
        return ResponseEntity.ok(service.getTeacher(teacherId));
    }

}

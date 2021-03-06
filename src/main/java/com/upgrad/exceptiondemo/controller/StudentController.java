package com.upgrad.exceptiondemo.controller;

import com.upgrad.exceptiondemo.exceptions.RequestedResourceNotFoundException;
import com.upgrad.exceptiondemo.model.ErrorModel;
import com.upgrad.exceptiondemo.model.Student;
import com.upgrad.exceptiondemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class StudentController {

    private final StudentService service;

    @GetMapping("/v1/students/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable String studentId){
        return ResponseEntity.ok(service.getStudent(studentId));
    }


    @GetMapping("/v1/students")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = null;
        students = service.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @ExceptionHandler(RequestedResourceNotFoundException.class)
    ResponseEntity<ErrorModel> handleRequestedResourceNotFoundException(){
        return new ResponseEntity(ErrorModel
                .builder()
                .errorCode("ERR_Student_NOT_FOUND")
                .errorMessage("Student Not Found")
                .build(), HttpStatus.BAD_REQUEST);
    }
}

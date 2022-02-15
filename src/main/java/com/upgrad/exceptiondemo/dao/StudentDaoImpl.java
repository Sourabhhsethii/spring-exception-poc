package com.upgrad.exceptiondemo.dao;

import com.upgrad.exceptiondemo.exceptions.RequestedResourceNotFoundException;
import com.upgrad.exceptiondemo.model.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class StudentDaoImpl implements StudentDao{
List<Student> students = Arrays.asList(
                            Student.builder().studentId("1").studentName("Manish").studentDob(LocalDate.of(1980, 9, 18).toString()).build(),
                            Student.builder().studentId("2").studentName("Lokesh").studentDob(LocalDate.of(1980, 9, 21).toString()).build()
                    );
    public Student findByStudentId(String studentId){
        try {

            return students.stream()
                    .filter(s -> s.getStudentId().equals(studentId))
                    .findFirst()
                    .get();
        } catch (Exception e){
            throw new RequestedResourceNotFoundException();
        }

    }

    public List<Student> findAll(){
        return students;
    }
}

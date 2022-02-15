package com.upgrad.exceptiondemo.dao;

import com.upgrad.exceptiondemo.model.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{
List<Student> students = Arrays.asList(
                            Student.builder().studentId("1").studentName("Manish").studentDob(LocalDate.of(1980, 9, 18).toString()).build(),
                            Student.builder().studentId("2").studentName("Lokesh").studentDob(LocalDate.of(1980, 9, 21).toString()).build()
                    );
    public Student findByStudentId(String studentId){
            return students.stream()
                    .filter(s -> s.getStudentId().equals(studentId))
                    .findFirst()
                    .get();

    }

    public List<Student> findAll(){
        return students;
    }
}

package com.example.newjpa.controller;

import com.example.newjpa.model.Student;
import com.example.newjpa.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students () {
    var obj = studentRepository.findAll();
    return obj;
    }

    @GetMapping("/addstudent")
    public List<Student> addstudent() {
        Student std = new Student();
        std.setBornDate(LocalDate.now());
        List<Student> lst = studentRepository.findAll();
        return lst;
    }

    @GetMapping("students/{name}")
    public List<Student> getallstudentsbyname(@PathVariable String name) {
        return studentRepository.findAllByName(name);
    }
}

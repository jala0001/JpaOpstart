package com.example.newjpa.config;

import com.example.newjpa.model.Student;
import com.example.newjpa.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class initData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Bruce");
        s1.setBornDate(LocalDate.of(2010, 11, 12));
        s1.setBornTime(LocalTime.of(10, 11, 12));
        studentRepository.save(s1);
        Student s2 = new Student();
        s2.setName("Jamie");
        s2.setBornDate(LocalDate.of(1994, 11, 21));
        s2.setBornTime(LocalTime.of(15, 16, 20));
        studentRepository.save(s2);

    }
}

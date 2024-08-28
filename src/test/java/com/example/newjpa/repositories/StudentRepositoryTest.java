package com.example.newjpa.repositories;

import com.example.newjpa.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOneTim() {
        List<Student> lst = studentRepository.findAllByName("Bruce");
        assertEquals(1, lst.size());
    }

    @Test
    void testOneViggo() {
        Student s1 = new Student();
        s1.setName("Viggo");
        s1.setBornDate(LocalDate.of(2010, 11, 10));
        studentRepository.save(s1);
        List<Student> lst = studentRepository.findAllByName("Viggo");
        assertEquals(1, lst.size());
    }
}
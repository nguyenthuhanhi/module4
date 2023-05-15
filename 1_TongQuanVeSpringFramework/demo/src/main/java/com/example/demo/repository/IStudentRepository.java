package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface IStudentRepository {
    List<Student> findAll();
}

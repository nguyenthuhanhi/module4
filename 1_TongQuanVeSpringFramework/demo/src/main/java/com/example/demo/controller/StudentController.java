package com.example.demo.controller;


import com.example.demo.repository.IStudentRepository;
import com.example.demo.service.IStudentService;
import com.example.demo.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;









}

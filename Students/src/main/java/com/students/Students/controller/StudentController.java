package com.students.Students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")

public class StudentController {

    @Autowired

    @GetMapping("allData")
    public List<Student> getAllData() {
        return studentService.getAllData();
    }

}

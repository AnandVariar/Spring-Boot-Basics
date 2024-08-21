package com.students.Students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired

    public List<Student> getAllData() {
        return studentDao.findAll()
    }
}

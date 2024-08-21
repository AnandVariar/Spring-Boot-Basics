package com.QuizDemo.QuizProject.service;

import com.QuizDemo.QuizProject.Question;
import com.QuizDemo.QuizProject.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
}

package com.QuizDemo.QuizProject.dao;

import com.QuizDemo.QuizProject.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

}

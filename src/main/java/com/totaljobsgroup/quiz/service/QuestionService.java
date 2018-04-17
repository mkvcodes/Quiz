package com.totaljobsgroup.quiz.service;

import java.util.List;

import org.springframework.ui.Model;

import com.totaljobsgroup.quiz.model.Answer;

/**
 *  Question Service Interface
 */
public interface QuestionService {
	
    List<String> getQuestions();

	int checkAnswer(Answer answer, Model model);

	
}

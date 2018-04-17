package com.totaljobsgroup.quiz.service;


import com.totaljobsgroup.quiz.controller.QuestionController;
import com.totaljobsgroup.quiz.model.Answer;
import com.totaljobsgroup.quiz.repository.AnswerRepository;
import com.totaljobsgroup.quiz.repository.QuestionRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Question Service implementation
 */
@Service
public class BasicQuestionService implements QuestionService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BasicQuestionService.class);

    private final QuestionRepository questionRepository;
    
    private final AnswerRepository answerRepository;

    @Autowired
    public BasicQuestionService(QuestionRepository questionRepository,AnswerRepository answerRepository){
        this.questionRepository = questionRepository;
        this.answerRepository=answerRepository;
    }
    private int score;
    
    //Get the Questions
    @Override
    public List<String> getQuestions() {
    	
    	return questionRepository.findAll();
       
    }
    //Checking the Answers
	public int checkAnswer(Answer answer, Model model) {
		score=0;
		List <String> ansList=answer.getAns();
		List<String>  repoList=answerRepository.findAllAnswers();
		for (int i=0;i<ansList.size();i++)
		{
			String userAnswer=ansList.get(i);
			String correctAns=repoList.get(i);
			if(userAnswer.equalsIgnoreCase(correctAns)){
				score=score+1;}
			else{
				score=score+0;}
		}
		
		return score;

	}
	
    
    
}

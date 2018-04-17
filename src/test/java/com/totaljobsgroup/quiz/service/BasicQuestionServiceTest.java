/*package com.totaljobsgroup.quiz.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.ui.Model;

import com.totaljobsgroup.quiz.model.Answer;
import com.totaljobsgroup.quiz.repository.AnswerRepository;
import com.totaljobsgroup.quiz.repository.QuestionRepository;


@RunWith(PowerMockRunner.class)
@PrepareForTest(BasicQuestionService.class)
public class BasicQuestionServiceTest {
	
	@InjectMocks
	private BasicQuestionService basicQuestionService;
	
	 @Mock
	 private  QuestionRepository questionRepository;
	
	 @Mock
	 private  AnswerRepository answerRepository;
	 
	 private List<String> testQuest;
	 
	 @Mock
	 private Answer answer;
	 
	 @Mock
	 private Model model;

	@Test
	public void testGetQuestions() {
		testQuest.add("q1");
		when(questionRepository.findAll()).thenReturn(testQuest);
		basicQuestionService.getQuestions();
		
	}
	
	@Test
	public void testCheckAnswer() {
		testQuest.add("q1");
		when(answer.getAns()).thenReturn(testQuest);
		when(answerRepository.findAllAnswers()).thenReturn(testQuest);
		basicQuestionService.checkAnswer(answer, model);
		
	}

}*/

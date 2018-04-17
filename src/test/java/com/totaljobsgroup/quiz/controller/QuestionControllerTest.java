/*
package com.totaljobsgroup.quiz.controller;

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.WebApplicationContext;

import com.totaljobsgroup.quiz.model.Answer;
import com.totaljobsgroup.quiz.service.QuestionService;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;


 //Tests for Question Controller
 
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = {TestContext.class, WebApplicationContext.class})
@WebMvcTest(QuestionController.class)
public class QuestionControllerTest {
    @Autowired
    private MockMvc mockMvc;
    
    @InjectMocks
    private QuestionController questionController;
 
    
    @Mock
    private QuestionService questionServiceMock;
    
    private List<String> quest;
    
    @Mock
	private Model model;
    
    @Mock
	private Answer answer;
    @Mock
	private BindingResult bindingResult;

    @Test
    public void getQuestions() throws Exception {
    	
    	
        // given
        String urlPath = "/questions";
        //when
        ResultActions result = mockMvc.perform(get(urlPath));
        // then
        result.andExpect(status().isOk());
        
        //test data
        quest.add("q1");
        quest.add("q2");
        quest.add("q3");
        quest.add("q4");
        when(questionServiceMock.getQuestions()).thenReturn(quest);
        questionController.getQuestions(model);
        }

    @Test
    public void answersPost() throws Exception {
    	
    	
    	  String urlPath = "/questions";
          //when
          ResultActions result = mockMvc.perform(get(urlPath));
          // then
          result.andExpect(status().isOk());
     
          //test data
        quest.add("q1");
        quest.add("q2");
        quest.add("q3");
        quest.add("q4");
        
        when(questionServiceMock.getQuestions()).thenReturn(quest);
        when(questionServiceMock.checkAnswer(answer, model)).thenReturn(2);
        questionController.answersPost(answer, bindingResult, model);
        }
}
*/
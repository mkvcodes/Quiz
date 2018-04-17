package com.totaljobsgroup.quiz.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.totaljobsgroup.quiz.model.Answer;
import com.totaljobsgroup.quiz.model.Question;
import com.totaljobsgroup.quiz.service.QuestionService;
 
/**
 * Question Controller class
 */
@Controller
public class QuestionController {
	
	@Autowired
	private  QuestionService questionService;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(QuestionController.class);
	
	@GetMapping("/")
    public String index() {
        return "index";
    }
	
	//Getting the list of Questions
	 @GetMapping("/questions")
    public String getQuestions(Model model) {
    	List<String> quest= questionService.getQuestions();
     	 model.addAttribute("questions", quest);
     	 model.addAttribute("answer", new Answer());
        return "questions";
    }
	 
	 //Posting the Answers
    @PostMapping("/questions")
    public String answersPost(@Valid Answer answer, BindingResult bindingResult, Model model) {
    	
        if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
        }
        
		int finalscore=questionService.checkAnswer(answer,model);
        List<String> quest= questionService.getQuestions();
        model.addAttribute("score", finalscore);
     	model.addAttribute("questions", quest);
        model.addAttribute("answer", answer);
        return "questions";
    }
    
  
}


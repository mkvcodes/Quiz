package com.totaljobsgroup.quiz.model;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Question {
	
	  @NotEmpty
	    private List<String> question;
	  

	public List<String> getQuestion() {
		return question;
	}

	public void setQuestion(List<String> question) {
		this.question = question;
	}

}

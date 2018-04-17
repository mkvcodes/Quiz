package com.totaljobsgroup.quiz.model;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Answer {
	
	    @NotEmpty
	    private List<String> ans;

		public List<String> getAns() {
			return ans;
		}

		public void setAns(List<String> ans) {
			this.ans = ans;

		}
		  
  }

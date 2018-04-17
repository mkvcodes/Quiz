package com.totaljobsgroup.quiz.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.totaljobsgroup.quiz.service.BasicQuestionService;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Static Question Repository implementation
 */
@Repository
public class StaticQuestionRepository implements QuestionRepository {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StaticQuestionRepository.class);
	
	@Override
    public List<String> findAll() {
        return asList("What is the capital of Cuba?",
                "What is the capital of France?",
                "What is the capital of Poland?",
                "What is the capital of Germany?");
    }
}

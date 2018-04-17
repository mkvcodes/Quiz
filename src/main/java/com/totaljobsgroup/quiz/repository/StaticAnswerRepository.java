package com.totaljobsgroup.quiz.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Static Question Repository implementation
 */
@Repository
public class StaticAnswerRepository implements AnswerRepository {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StaticAnswerRepository.class);
	
	@Override
    public List<String> findAllAnswers() {
        return asList("Havana",
                "Paris",
                "Warsaw",
                "Berlin");
    }
}

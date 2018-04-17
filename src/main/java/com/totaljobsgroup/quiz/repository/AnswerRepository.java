package com.totaljobsgroup.quiz.repository;

import java.util.List;

/**
 * Question Repository Interface
 */
public interface AnswerRepository {
    List<String> findAllAnswers();
}

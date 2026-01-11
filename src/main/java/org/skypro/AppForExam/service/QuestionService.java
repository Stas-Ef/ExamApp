package org.skypro.AppForExam.service;

import org.skypro.AppForExam.model.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);


    Collection<Question> getAll();

    Question getRandomQuestion();
}

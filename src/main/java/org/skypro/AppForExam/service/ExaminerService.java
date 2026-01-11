package org.skypro.AppForExam.service;

import org.skypro.AppForExam.model.Question;

import java.util.Collection;

public interface ExaminerService {


    Collection<Question> getQuestions(int amount);
}

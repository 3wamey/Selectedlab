package org.example.data.Model;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String title;
    private List<Question> questions;

    public Quiz() {
        this.title = title;
        this.questions = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}

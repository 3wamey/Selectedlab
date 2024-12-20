package org.example.data.Builder;

import org.example.data.Model.Question;
import org.example.data.Model.Quiz;
import java.util.ArrayList;


//Allows flexible quiz creation.

public class QuizBuilder {

    private Quiz quiz;

    public QuizBuilder() {
        this.quiz = new Quiz();
    }

    public QuizBuilder setTitle(String title) {
        quiz.setTitle(title);
        return this;
    }

    public QuizBuilder addQuestion(Question question) {
        if (quiz.getQuestions() == null) {
            quiz.setQuestions(new ArrayList<>());
        }
        quiz.getQuestions().add(question);
        return this;
    }

    public Quiz build() {
        return quiz;
    }

}

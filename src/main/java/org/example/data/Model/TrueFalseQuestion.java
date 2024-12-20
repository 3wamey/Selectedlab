package org.example.data.Model;

public class TrueFalseQuestion  extends Question {

    private boolean correctAnswer;

    public TrueFalseQuestion(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean validateAnswer(String answer) {
        return Boolean.parseBoolean(answer) == correctAnswer;
    }

}

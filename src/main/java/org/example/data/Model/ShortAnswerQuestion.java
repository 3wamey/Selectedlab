package org.example.data.Model;

public class ShortAnswerQuestion  extends Question{

    private String correctAnswer;

    public ShortAnswerQuestion(String text, String correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean validateAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer.trim());
    }


}

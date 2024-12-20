package org.example.data.Model;

public abstract class Question {
    private String text;

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // Abstract method to validate the answer
    public abstract boolean validateAnswer(String answer);
}







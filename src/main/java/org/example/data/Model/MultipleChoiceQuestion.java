package org.example.data.Model;

import java.util.List;

public class MultipleChoiceQuestion  extends Question{


    private List<String> options;
    private int correctOption;

    public MultipleChoiceQuestion(String text, List<String> options, String correctOption) {
        super(text);
        this.options = options;
        this.correctOption = Integer.parseInt(correctOption);
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(int correctOption) {
        this.correctOption = correctOption;
    }

    @Override
    public boolean validateAnswer(String answer) {
        try {
            int chosenOption = Integer.parseInt(answer);
            return chosenOption == correctOption;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}

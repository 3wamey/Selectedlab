package org.example.data.Factory;


import org.example.data.Model.MultipleChoiceQuestion;
import org.example.data.Model.Question;
import org.example.data.Model.ShortAnswerQuestion;
import org.example.data.Model.TrueFalseQuestion;

import java.util.List;

// Creates different question types.
public class QuestionFactory {

    public static Question createQuestion(String type, String questionText, List<String> options, String answer) {
        switch (type) {
            case "MultipleChoice":
                return new MultipleChoiceQuestion(questionText, options, answer);
            case "TrueFalse":
                return new TrueFalseQuestion(questionText, Boolean.parseBoolean(answer));
            case "ShortAnswer":
                return new ShortAnswerQuestion(questionText, answer);
            default:
                throw new IllegalArgumentException("Invalid Question Type");
        }
    }
}

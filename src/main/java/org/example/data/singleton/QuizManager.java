package org.example.data.singleton;

//Manages quiz creation and lifecycle.
public class QuizManager {

    private static QuizManager instance;

    private QuizManager() {}

    public static QuizManager getInstance() {
        if (instance == null) {
            instance = new QuizManager();
        }
        return instance;
    }

    public void createQuiz(String title) {
        System.out.println("Quiz created: " + title);
    }

    public void startQuiz() {
        System.out.println("Quiz started.");
    }


}

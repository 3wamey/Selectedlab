package org.example.data.Proxy;


//Secures sensitive operations such as starting a quiz.

import org.example.data.singleton.QuizManager;

public class QuizProxy {

    private QuizManager quizManager;

    public QuizProxy(QuizManager quizManager) {
        this.quizManager = quizManager;
    }

    public void startQuiz(String role) {
        if ("Admin".equals(role) || "Teacher".equals(role)) {
            quizManager.startQuiz();
        } else {
            System.out.println("Access Denied!");
        }
    }

}

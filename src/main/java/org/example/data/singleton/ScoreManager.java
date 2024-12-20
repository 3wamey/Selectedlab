package org.example.data.singleton;


import java.util.HashMap;
import java.util.Map;

//Handles scoring and results storage.
public class ScoreManager {
    // Singleton instance
    private static ScoreManager instance;

    // Storage for scores, mapping user to their quiz results
    private final Map<String, Map<String, Integer>> userScores;

    // Private constructor to prevent instantiation
    private ScoreManager() {
        userScores = new HashMap<>();
    }

    // Static method to get the single instance
    public static synchronized ScoreManager getInstance() {
        if (instance == null) {
            instance = new ScoreManager();
        }
        return instance;
    }

    // Method to store a score for a user
    public void addScore(String username, String quizTitle, int score) {
        userScores.putIfAbsent(username, new HashMap<>());
        userScores.get(username).put(quizTitle, score);
    }

    // Method to retrieve the score of a specific user for a specific quiz
    public Integer getScore(String username, String quizTitle) {
        Map<String, Integer> scores = userScores.get(username);
        if (scores != null) {
            return scores.get(quizTitle);
        }
        return null;
    }

    // Method to get all scores for a user
    public Map<String, Integer> getUserScores(String username) {
        return userScores.getOrDefault(username, new HashMap<>());
    }

    // Method to display all stored results (for debugging or reporting purposes)
    public void displayAllScores() {
        for (Map.Entry<String, Map<String, Integer>> userEntry : userScores.entrySet()) {
            System.out.println("User: " + userEntry.getKey());
            for (Map.Entry<String, Integer> quizEntry : userEntry.getValue().entrySet()) {
                System.out.println("  Quiz: " + quizEntry.getKey() + ", Score: " + quizEntry.getValue());
            }
        }
    }



}

package org.example.data.Gui;

import javax.swing.*;
import java.awt.*;

public class TakeQuizForm  extends JFrame {


    private JComboBox<String> quizSelector;
    private JPanel questionPanel;
    private JButton previousButton;
    private JButton nextButton;
    private JButton submitButton;
    private JLabel questionNumberLabel;

    public TakeQuizForm() {
        initializeComponents();
        setupLayout();
        setupEventListeners();
    }

    private void initializeComponents() {
        setTitle("Take Quiz");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        quizSelector = new JComboBox<>();
        questionPanel = new JPanel();
        previousButton = new JButton("Previous");
        nextButton = new JButton("Next");
        submitButton = new JButton("Submit");
        questionNumberLabel = new JLabel("Question 1 of X");

        // Add sample quizzes (replace with actual quiz data)
        quizSelector.addItem("Sample Quiz 1");
        quizSelector.addItem("Sample Quiz 2");
    }

    private void setupLayout() {
        setLayout(new BorderLayout(10, 10));

        // Quiz Selection Panel
        JPanel selectionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        selectionPanel.add(new JLabel("Select Quiz:"));
        selectionPanel.add(quizSelector);
        add(selectionPanel, BorderLayout.NORTH);

        // Question Panel
        questionPanel.setLayout(new BorderLayout());
        questionPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(questionPanel, BorderLayout.CENTER);

        // Navigation Panel
        JPanel navigationPanel = new JPanel(new FlowLayout());
        navigationPanel.add(previousButton);
        navigationPanel.add(questionNumberLabel);
        navigationPanel.add(nextButton);
        navigationPanel.add(submitButton);
        add(navigationPanel, BorderLayout.SOUTH);

        // Initially display first question
        displayQuestion(1);
    }

    private void setupEventListeners() {
        quizSelector.addActionListener(e -> loadQuiz());
        previousButton.addActionListener(e -> showPreviousQuestion());
        nextButton.addActionListener(e -> showNextQuestion());
        submitButton.addActionListener(e -> submitQuiz());
    }

    private void loadQuiz() {
        // Implementation for loading the selected quiz
        displayQuestion(1);
    }

    private void displayQuestion(int questionNumber) {
        questionPanel.removeAll();

        // Sample question display (replace with actual question data)
        JLabel questionLabel = new JLabel("Sample Question " + questionNumber);
        questionPanel.add(questionLabel, BorderLayout.NORTH);

        // Sample answers (replace with actual answer options)
        JPanel answersPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        ButtonGroup group = new ButtonGroup();
        for (int i = 1; i <= 4; i++) {
            JRadioButton option = new JRadioButton("Option " + i);
            group.add(option);
            answersPanel.add(option);
        }
        questionPanel.add(answersPanel, BorderLayout.CENTER);

        questionNumberLabel.setText("Question " + questionNumber + " of X");
        questionPanel.revalidate();
        questionPanel.repaint();
    }

    private void showPreviousQuestion() {
        // Implementation for showing the previous question
    }

    private void showNextQuestion() {
        // Implementation for showing the next question
    }

    private void submitQuiz() {
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to submit the quiz?",
                "Submit Quiz",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Implementation for submitting the quiz
            JOptionPane.showMessageDialog(this, "Quiz submitted successfully!");
            dispose();
        }
    }
}



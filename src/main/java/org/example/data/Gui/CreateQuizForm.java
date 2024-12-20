package org.example.data.Gui;

import javax.swing.*;
import java.awt.*;

public class CreateQuizForm   extends JFrame {

    private JTextField quizTitleField;
    private JComboBox<String> questionTypeCombo;
    private JTextArea questionArea;
    private JPanel answersPanel;
    private JButton addQuestionButton;
    private JButton saveQuizButton;

    public CreateQuizForm() {
        initializeComponents();
        setupLayout();
        setupEventListeners();
    }

    private void initializeComponents() {
        setTitle("Create Quiz");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        quizTitleField = new JTextField(20);
        String[] questionTypes = {"Multiple Choice", "True/False", "Short Answer"};
        questionTypeCombo = new JComboBox<>(questionTypes);
        questionArea = new JTextArea(4, 20);
        answersPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        addQuestionButton = new JButton("Add Question");
        saveQuizButton = new JButton("Save Quiz");
    }

    private void setupLayout() {
        setLayout(new BorderLayout(10, 10));
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Quiz Title Panel
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        titlePanel.add(new JLabel("Quiz Title:"));
        titlePanel.add(quizTitleField);
        mainPanel.add(titlePanel);

        // Question Type Panel
        JPanel typePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        typePanel.add(new JLabel("Question Type:"));
        typePanel.add(questionTypeCombo);
        mainPanel.add(typePanel);

        // Question Panel
        JPanel questionPanel = new JPanel(new BorderLayout());
        questionPanel.add(new JLabel("Question:"), BorderLayout.NORTH);
        questionPanel.add(new JScrollPane(questionArea), BorderLayout.CENTER);
        mainPanel.add(questionPanel);

        // Answers Panel
        JPanel answersContainer = new JPanel(new BorderLayout());
        answersContainer.add(new JLabel("Answers:"), BorderLayout.NORTH);
        answersContainer.add(new JScrollPane(answersPanel), BorderLayout.CENTER);
        mainPanel.add(answersContainer);

        // Buttons Panel
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonsPanel.add(addQuestionButton);
        buttonsPanel.add(saveQuizButton);

        add(mainPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void setupEventListeners() {
        questionTypeCombo.addActionListener(e -> updateAnswersPanel());
        addQuestionButton.addActionListener(e -> addQuestion());
        saveQuizButton.addActionListener(e -> saveQuiz());
    }

    private void updateAnswersPanel() {
        answersPanel.removeAll();
        String selectedType = (String) questionTypeCombo.getSelectedItem();

        if ("Multiple Choice".equals(selectedType)) {
            for (int i = 0; i < 4; i++) {
                JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                optionPanel.add(new JLabel("Option " + (i + 1) + ":"));
                optionPanel.add(new JTextField(20));
                answersPanel.add(optionPanel);
            }
        } else if ("True/False".equals(selectedType)) {
            ButtonGroup group = new ButtonGroup();
            JRadioButton trueButton = new JRadioButton("True");
            JRadioButton falseButton = new JRadioButton("False");
            group.add(trueButton);
            group.add(falseButton);
            answersPanel.add(trueButton);
            answersPanel.add(falseButton);
        }

        answersPanel.revalidate();
        answersPanel.repaint();
    }

    private void addQuestion() {
        // Implementation for adding a question to the quiz
        JOptionPane.showMessageDialog(this, "Question added successfully!");
        clearForm();
    }

    private void saveQuiz() {
        // Implementation for saving the entire quiz
        JOptionPane.showMessageDialog(this, "Quiz saved successfully!");
        dispose();
    }

    private void clearForm() {
        questionArea.setText("");
        updateAnswersPanel();
    }


}

package org.example.data.Gui;

import javax.swing.*;
import java.awt.*;

public class Mainform extends JFrame {

    private JButton createQuizButton;
    private JButton takeQuizButton;
    private JButton viewResultsButton;

    public  Mainform() {
        initializeComponents();
        setupLayout();
        setupEventListeners();
    }

    private void initializeComponents() {
        setTitle("Quiz Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        createQuizButton = new JButton("Create Quiz");
        takeQuizButton = new JButton("Take Quiz");
        viewResultsButton = new JButton("View Results");
    }

    private void setupLayout() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(createQuizButton, gbc);

        gbc.gridy = 1;
        mainPanel.add(takeQuizButton, gbc);

        gbc.gridy = 2;
        mainPanel.add(viewResultsButton, gbc);

        add(mainPanel);
    }

    private void setupEventListeners() {
        createQuizButton.addActionListener(e -> openCreateQuizForm());
        takeQuizButton.addActionListener(e -> openTakeQuizForm());
        viewResultsButton.addActionListener(e -> openViewResultsForm());
    }

    private void openCreateQuizForm() {
        new CreateQuizForm().setVisible(true);
    }

    private void openTakeQuizForm() {
        new TakeQuizForm().setVisible(true);
    }

    private void openViewResultsForm() {
        new ViewResultsForm().setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Mainform().setVisible(true);
        });
    }

}

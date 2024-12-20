package org.example.data.Gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewResultsForm  extends JFrame {




    private JComboBox<String> userSelector;
    private JTable resultsTable;
    private JLabel averageScoreLabel;
    private JButton exportButton;

    public ViewResultsForm() {
        initializeComponents();
        setupLayout();
        setupEventListeners();
    }

    private void initializeComponents() {
        setTitle("View Results");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        userSelector = new JComboBox<>();
        // Add sample users (replace with actual user data)
        userSelector.addItem("All Users");
        userSelector.addItem("User 1");
        userSelector.addItem("User 2");

        // Create table with sample data
        String[] columns = {"Quiz Name", "Date Taken", "Score", "Time Taken"};
        Object[][] data = {
                {"Sample Quiz 1", "2024-01-20", "85%", "15:30"},
                {"Sample Quiz 2", "2024-01-21", "92%", "12:45"}
        };
        DefaultTableModel model = new DefaultTableModel(data, columns);
        resultsTable = new JTable();
        resultsTable.setFillsViewportHeight(true);

        averageScoreLabel = new JLabel("Average Score: 88.5%");
        exportButton = new JButton("Export Results");
    }

    private void setupLayout() {
        setLayout(new BorderLayout(10, 10));

        // User Selection Panel
        JPanel selectionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        selectionPanel.add(new JLabel("Select User:"));
        selectionPanel.add(userSelector);
        add(selectionPanel, BorderLayout.NORTH);

        // Results Table
        JScrollPane scrollPane = new JScrollPane(resultsTable);
        add(scrollPane, BorderLayout.CENTER);

        // Bottom Panel
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(averageScoreLabel);
        bottomPanel.add(exportButton);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void setupEventListeners() {
        userSelector.addActionListener(e -> updateResults());
        exportButton.addActionListener(e -> exportResults());
    }

    private void updateResults() {
        // Implementation for updating results based on selected user
        String selectedUser = (String) userSelector.getSelectedItem();
        // Update table and average score based on selection
    }

    private void exportResults() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Export Results");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            // Implementation for exporting results to file
            JOptionPane.showMessageDialog(this, "Results exported successfully!");
        }
    }
}









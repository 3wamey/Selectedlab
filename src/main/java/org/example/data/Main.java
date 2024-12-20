package org.example.data;

import org.example.data.Factory.RoleFactory;
import org.example.data.Gui.Mainform;
import org.example.data.Model.User;
import org.example.data.singleton.QuizManager;
import org.example.data.singleton.ScoreManager;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        initializeApplication();

    }

        private static void initializeApplication() {
            // Set the look and feel to the system default
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Initialize managers (singletons)
            QuizManager.getInstance();
            ScoreManager.getInstance();

            // Launch the GUI on the Event Dispatch Thread
            SwingUtilities.invokeLater(() -> {
                try {
                    Mainform mainForm = new Mainform();
                    mainForm.setVisible(true);
                } catch (Exception e) {
                    handleStartupError(e);
                }
            });
        }

        private static void handleStartupError(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                    "Error starting application: " + e.getMessage(),
                    "Startup Error",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(1);
        }


    }

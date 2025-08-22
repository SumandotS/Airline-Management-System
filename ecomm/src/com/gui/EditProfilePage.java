package com.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditProfilePage extends JFrame {
    public EditProfilePage() {
        setTitle("Edit Profile");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel editProfileLabel = new JLabel("Edit Profile");
        editProfileLabel.setBounds(10, 20, 200, 25);
        panel.add(editProfileLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 50, 80, 25);
        panel.add(usernameLabel);

        JTextField usernameField = new JTextField("user123");
        usernameField.setBounds(100, 50, 165, 25);
        panel.add(usernameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 80, 80, 25);
        panel.add(emailLabel);

        JTextField emailField = new JTextField("user@example.com");
        emailField.setBounds(100, 80, 165, 25);
        panel.add(emailField);

        JButton saveButton = new JButton("Save Changes");
        saveButton.setBounds(10, 110, 150, 25);
        panel.add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Save profile changes logic
                JOptionPane.showMessageDialog(null, "Profile updated successfully.");
                dispose(); // Close the edit profile form
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EditProfilePage editProfilePage = new EditProfilePage();
            editProfilePage.setVisible(true);
        });
    }
}

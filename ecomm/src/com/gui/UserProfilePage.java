package com.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfilePage extends JFrame {
    public UserProfilePage() {
        setTitle("User Profile");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel profileLabel = new JLabel("User Profile");
        profileLabel.setBounds(10, 20, 200, 25);
        panel.add(profileLabel);

        // Example profile details
        JLabel usernameLabel = new JLabel("Username: user123");
        usernameLabel.setBounds(10, 50, 200, 25);
        panel.add(usernameLabel);

        JLabel emailLabel = new JLabel("Email: user@example.com");
        emailLabel.setBounds(10, 80, 200, 25);
        panel.add(emailLabel);

        JButton editProfileButton = new JButton("Edit Profile");
        editProfileButton.setBounds(10, 110, 150, 25);
        panel.add(editProfileButton);

        editProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open edit profile form
                new EditProfilePage().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserProfilePage userProfilePage = new UserProfilePage();
            userProfilePage.setVisible(true);
        });
    }
}

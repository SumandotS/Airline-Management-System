package com.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartPage extends JFrame {
    public CartPage() {
        setTitle("Shopping Cart");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel cartLabel = new JLabel("Your Cart:");
        cartLabel.setBounds(10, 20, 200, 25);
        panel.add(cartLabel);

        // Example cart items
        JLabel item1Label = new JLabel("Product 1 - $10.00");
        item1Label.setBounds(10, 50, 200, 25);
        panel.add(item1Label);

        JLabel item2Label = new JLabel("Product 2 - $15.00");
        item2Label.setBounds(10, 80, 200, 25);
        panel.add(item2Label);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.setBounds(10, 120, 150, 25);
        panel.add(checkoutButton);

        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Proceed to checkout logic
                JOptionPane.showMessageDialog(null, "Proceeding to checkout.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CartPage cartPage = new CartPage();
            cartPage.setVisible(true);
        });
    }
}

package com.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductsPage extends JFrame {
    public ProductsPage() {
        setTitle("Products");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel productsLabel = new JLabel("Products List:");
        productsLabel.setBounds(10, 20, 200, 25);
        panel.add(productsLabel);

        // Example product buttons
        JButton product1Button = new JButton("Product 1");
        product1Button.setBounds(10, 50, 150, 25);
        panel.add(product1Button);

        JButton product2Button = new JButton("Product 2");
        product2Button.setBounds(10, 80, 150, 25);
        panel.add(product2Button);

        // Add action listeners to product buttons
        product1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open product details
                new ProductDetailsPage("Product 1").setVisible(true);
            }
        });

        product2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open product details
                new ProductDetailsPage("Product 2").setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProductsPage productsPage = new ProductsPage();
            productsPage.setVisible(true);
        });
    }
}

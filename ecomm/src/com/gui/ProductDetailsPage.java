package com.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductDetailsPage extends JFrame {
    private String productName;

    public ProductDetailsPage(String productName) {
        this.productName = productName;
        setTitle("Product Details");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel productLabel = new JLabel("Details for: " + productName);
        productLabel.setBounds(10, 20, 300, 25);
        panel.add(productLabel);

        JButton addToCartButton = new JButton("Add to Cart");
        addToCartButton.setBounds(10, 50, 150, 25);
        panel.add(addToCartButton);

        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add product to cart logic
                JOptionPane.showMessageDialog(null, productName + " added to cart.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProductDetailsPage productDetailsPage = new ProductDetailsPage("Sample Product");
            productDetailsPage.setVisible(true);
        });
    }
}

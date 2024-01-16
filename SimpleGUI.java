package com.practice.java.program;

import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        frame.setSize(300, 200); // Set the size of the window

        // Create a label
        JLabel label = new JLabel("Hello, this is a label!");
        label.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text

        // Add the label to the frame
        frame.getContentPane().add(label);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}


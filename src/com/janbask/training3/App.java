package com.janbask.training3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton buttonMessage;
    private JPanel containerPanel;

    public App() {
        buttonMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked on the first button");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Events Example");
        JPanel ui = new App().containerPanel;
        frame.setContentPane(ui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
    }
}

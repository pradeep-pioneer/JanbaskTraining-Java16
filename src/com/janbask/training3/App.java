package com.janbask.training3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.*;

public class App {
    private JButton buttonMessage;
    private JPanel containerPanel;
    private JButton buttonBeanInfo;

    public App() {
        buttonMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked on the first button");
            }
        });
        buttonBeanInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BeanInfo beanInfo = Introspector.getBeanInfo(JFrame.class);
                    BeanDescriptor beanDescriptor = beanInfo.getBeanDescriptor();
                    String beanData = String.format("Display Name: %s\nShort Description: %s",
                            beanDescriptor.getDisplayName(),
                            beanDescriptor.getShortDescription());
                    JOptionPane.showMessageDialog(null, beanData);
                }
                catch (IntrospectionException introspectionException){
                    String messageData = String.format("There was an error!\nMessage: %s",
                            introspectionException.getMessage());
                    JOptionPane.showMessageDialog(null, messageData);
                }
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

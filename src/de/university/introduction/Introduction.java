package de.university.introduction;

import javax.swing.*;

public class Introduction{

    public static void start() {
        JDialog tutorial = new JDialog();
        tutorial.setTitle("University: tutorial");
        tutorial.setSize(1000,500);
        tutorial.setModal(true);
        tutorial.add(new JLabel("Tutorial"));
        tutorial.setVisible(true);
    }
}
package de.university.gui.mainMenu;

import de.university.connect.Client;
import de.university.data.Data;
import de.university.data.professors.Prof;
import de.university.gui.GUI;
import de.university.gui.personal.HireDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

public class MainMenu extends JDialog {
    private MainMenu me;
    private GUI gui;
    private Data data;

    private JPanel panel = new JPanel(new GridLayout(0,1));
    private JButton singleplayer = new JButton("Singleplayer");
    private JTextField username = new JTextField("Username");
    private JButton multiplayer = new JButton("Multiplayer");
    private JButton credits = new JButton("Credits");

    private ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            me.dispose();
        }
    };

    //----constructor----
    public MainMenu(GUI gui){
        super();
        this.gui = gui;
        this.me = this;
        this.setMinimumSize(new Dimension(700,800));
        this.setPreferredSize(new Dimension(700,800));
        this.setLocationRelativeTo(this.gui);

        //init
        add(panel);
        panel.add(singleplayer);
        singleplayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.setVisible(true);
                dispose();
                new de.university.control.Timer(gui).run();
            }
        });
        panel.add(username);
        panel.add(multiplayer);
        multiplayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Client().join(username.getText());
                } catch (IOException e1) {
                }
            }
        });
        panel.add(credits);
        credits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });


        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

}

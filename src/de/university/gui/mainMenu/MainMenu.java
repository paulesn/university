package de.university.gui.mainMenu;

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
import java.util.ArrayList;

public class MainMenu extends JDialog {
    private MainMenu me;
    private GUI gui;
    private JPanel colums;
    private JLabel[] titles = new JLabel[6];
    private JPanel pane;
    private JPanel pane1;
    private JPanel pane2;
    private JScrollPane sPane;
    private Font font = new Font("Monospace", Font.BOLD, 25);
    private Data data;
    private ArrayList<Prof> profs;
    private String profcount;
    private JLabel labelProfCount = new JLabel("", SwingConstants.CENTER);

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
        //this.setLayout(new GridLayout(0,1));
        //init();

        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        /*
        in the build mode the build dialog will be closed and the buttens will be colored:
        red cant click here
        green can click here
        blue: this buttons will be the room if you click on that below you're cursor XD
         */
    }

}

package de.university.gui.personal;

import de.university.data.professors.Prof;
import de.university.gui.GUI;

import javax.swing.*;
import java.awt.*;

public class HireDialog extends JDialog {
    //----variables----
    private GUI gui;
    private JPanel colums;
    private JLabel[] titles = new JLabel[6];
    private JPanel pane;
    private JScrollPane sPane;
    private PersonalDialog dialog;
    private Font font = new Font("Monospace", Font.BOLD, 25);
    //----methods----

    /**
     * inits the hire dialog
     */
    private void init(){
        //main pane

        pane = new JPanel();
        pane.setBackground(Color.red);
        pane.setLayout(new GridLayout(0,1));
        sPane = new JScrollPane(pane);
        this.add(sPane);

        colums = new JPanel();
        pane.add(colums);
        colums.setLayout(new FlowLayout());
        //the datas
        titles[1] = new JLabel("Name");
        titles[1].setFont(font);
        colums.add(titles[1]);
        titles[2] = new JLabel("Costs");
        titles[2].setFont(font);
        colums.add(titles[2]);
        titles[3] = new JLabel("Benefits");
        titles[3].setFont(font);
        colums.add(titles[3]);
        titles[4] = new JLabel("Info");
        titles[4].setFont(font);
        colums.add(titles[4]);
        titles[5] = new JLabel("Hire");
        titles[5].setFont(font);
        colums.add(titles[5]);
        //
        //TODO get professors from Data

        pane.add(new HireingTableRow(new Prof("test", 200, 2, 4, ""), gui, this.dialog, this));
    }

    //----constructor----
    public HireDialog(GUI gui, PersonalDialog dialog){
        super();
        this.gui = gui;
        this.dialog = dialog;
        this.setMinimumSize(new Dimension(700,800));
        this.setPreferredSize(new Dimension(700,800));
        this.setLocationRelativeTo(this.gui);
        //this.setLayout(new GridLayout(0,1));
        init();
        this.setVisible(true);
        /*
        in the build mode the build dialog will be closed and the buttens will be colored:
        red cant click here
        green can click here
        blue: this buttons will be the room if you click on that below you're cursor XD
         */
    }
}

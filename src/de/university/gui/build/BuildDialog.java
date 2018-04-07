package de.university.gui.build;

import de.university.gui.GUI;

import javax.swing.*;
import java.awt.*;

public class BuildDialog extends JDialog {
    //----variables----
    private GUI gui;
    private JPanel colums;
    private JLabel[] titles = new JLabel[6];
    private JPanel pane;
    private JScrollPane sPane;
    //----methods----

    /**
     * inits the dialog
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
        titles[0] = new JLabel("Icon");
        colums.add(titles[0]);
        titles[1] = new JLabel("Name");
        colums.add(titles[1]);
        titles[2] = new JLabel("Costs");
        colums.add(titles[2]);
        titles[3] = new JLabel("Benefits");
        colums.add(titles[3]);
        titles[4] = new JLabel("Info");
        colums.add(titles[4]);
        titles[5] = new JLabel("Build");
        colums.add(titles[5]);
        //
        //TODO get all rooms from Data
    }

    //----constructor----
    public BuildDialog(GUI gui){
        super();
        this.gui = gui;
        this.setMinimumSize(new Dimension(500,500));
        this.setPreferredSize(new Dimension(500,500));
        //this.setLayout(new GridLayout(0,1));
        init();
        this.setVisible(true);
        //TODO a button will be selected and starts the build mode or the info dialog of the building will be shown
        /*
        in the build mode the build dialog will be closed and the buttens will be colored:
        red cant click here
        green can click here
        blue: this buttons will be the room if you click on that below you're cursor XD
         */
    }

}

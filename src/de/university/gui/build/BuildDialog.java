package de.university.gui.build;

import de.university.data.rooms.*;
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
    private Font font = new Font("Monospace", Font.BOLD, 25);
    //----methods----

    /**
     * inits the dialog
     */
    private void init(){
        //main pane

        pane = new JPanel();
        pane.setLayout(new GridLayout(0,1));
        sPane = new JScrollPane(pane);
        this.add(sPane);

        colums = new JPanel();
        pane.add(colums);
        colums.setLayout(new FlowLayout());
        //the datas
        titles[0] = new JLabel("Icon");
        titles[0].setFont(font);
        colums.add(titles[0]);
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
        titles[5] = new JLabel("Build");
        titles[5].setFont(font);
        colums.add(titles[5]);
        //
        //get all rooms from Data
        pane.add(new TableRow(new Bibliothek(),gui));
        pane.add(new TableRow(new Buero(),gui));
        pane.add(new TableRow(new Cafeteria(),gui));
        pane.add(new TableRow(new Fachschaft(),gui));
        pane.add(new TableRow(new Flur(),gui));
        pane.add(new TableRow(new Gras(),gui));
        pane.add(new TableRow(new Hoersaal(),gui));
        pane.add(new TableRow(new Lernraum(),gui));
        pane.add(new TableRow(new Mensa(),gui));
        pane.add(new TableRow(new Parkplatz(),gui));
        pane.add(new TableRow(new Seminarraum(),gui));
        pane.add(new TableRow(new Wohnheim(),gui));


    }

    //----constructor----
    public BuildDialog(GUI gui){
        super();
        this.gui = gui;
        this.setMinimumSize(new Dimension(700,800));
        this.setPreferredSize(new Dimension(700,800));
        this.setLocationRelativeTo(this.gui);
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

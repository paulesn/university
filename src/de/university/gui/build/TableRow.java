package de.university.gui.build;

import javax.swing.*;
import java.awt.*;

public class TableRow extends JPanel{
    //----variables----
    private ImageIcon icon;
    private JLabel name;
    private JLabel costs;
    private JLabel benefits;
    private JButton info;
    private JButton build;
    //----methods----

    /**
     * inits the row
     */
    private void init(){
        //TODO Icon

        this.name = new JLabel();
        this.add(name);
        this.costs = new JLabel();
        this.add(costs);
        this.benefits = new JLabel();
        this.add(benefits);

        this.info = new JButton("info"); //TODO init with icon
        this.add(info);
        this.build = new JButton("build");//TODO init with icon
        this.add(build);


    }
    //----constructor----

    public TableRow(ImageIcon icon, String name, String costs, String benefits) {
        super();
        this.setLayout(new FlowLayout());
        init();
        this.icon = icon;
        this.name.setText(name);
        this.costs.setText(costs);
        this.benefits.setText(benefits);
    }
}

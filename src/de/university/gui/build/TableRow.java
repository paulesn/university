package de.university.gui.build;

import de.university.data.rooms.Room;
import de.university.gui.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableRow extends JPanel{
    //----variables----
    private GUI gui;
    private ImageIcon icon;
    private JLabel name;
    private JLabel costs;
    private JLabel benefits;
    private JButton info;
    private JButton build;
    private Room room;
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
        this.build.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //set Playground to build mode
                gui.setButtonMode(true,room);
            }
        });
        this.add(build);


    }
    //----constructor----

    public TableRow(Room room, GUI gui) {
        super();
        this.gui = gui;
        this.room = room;
        this.setLayout(new FlowLayout());
        init();
        this.icon = icon;
        this.name.setText(room.getName());
        this.costs.setText(""+room.getCosts());
        this.benefits.setText(room.getBenefits());
    }
}

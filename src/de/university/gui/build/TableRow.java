package de.university.gui.build;

import de.university.data.rooms.Room;
import de.university.gui.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableRow extends JPanel{
    //----variables----
    private BuildDialog owner;
    private GUI gui;
    private ImageIcon icon;
    private JLabel name;
    private JLabel costs;
    private JLabel benefits;
    private JButton info;
    private JButton build;
    private Room room;
    private Font font = new Font("Monospace", Font.BOLD, 25);
    //----methods----

    /**
     * inits the row
     */
    private void init(){
        //TODO Icon

        this.name = new JLabel();
        this.name.setFont(font);
        this.add(name);
        this.costs = new JLabel();
        this.costs.setFont(font);
        this.add(costs);
        this.benefits = new JLabel();
        this.benefits.setFont(font);
        this.add(benefits);

        this.info = new JButton("Info"); //TODO init with icon
        this.info.setFont(font);
        this.info.setBackground(Color.GRAY);
        this.info.setForeground(Color.WHITE);
        this.add(info);
        this.build = new JButton("Build");//TODO init with icon
        this.build.setFont(font);
        this.build.setBackground(Color.GRAY);
        this.build.setForeground(Color.WHITE);
        this.build.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //set Playground to build mode
                gui.setButtonMode(true,room);
                //close owner
                owner.dispose();
            }
        });
        this.add(build);


    }
    //----constructor----

    public TableRow(Room room, GUI gui, BuildDialog owner) {
        super();
        this.owner = owner;
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

package de.university.gui.personal;

import de.university.data.rooms.Room;
import de.university.gui.GUI;
import de.university.data.professors.Prof;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalTableRow extends JPanel{
    //----variables----
    private GUI gui;
    private Prof prof;
    private JLabel name;
    private JLabel costs;
    private JLabel wellbeingBonus;
    private JLabel benefits;
    private JButton info;
    private JButton hire;
    private Font font = new Font("Monospace", Font.BOLD, 25);
    //----methods----

    /**
     * inits the row
     */
    private void init(){

        this.name = new JLabel();
        this.name.setFont(font);
        this.add(name);
        this.costs = new JLabel();
        this.costs.setFont(font);
        this.add(costs);
        this.wellbeingBonus = new JLabel();
        this.wellbeingBonus.setFont(font);
        this.add(wellbeingBonus);
        this.benefits = new JLabel();
        this.benefits.setFont(font);
        this.add(benefits);
        this.info = new JButton("Info");
        this.info.setBackground(Color.gray);
        this.info.setForeground(Color.white);
        this.info.setActionCommand("Info");
        this.info.setFont(font);
        this.info.setPreferredSize(new Dimension(150,50));
        this.add(info);
        this.hire = new JButton("Fire");
        this.hire.setBackground(Color.gray);
        this.hire.setForeground(Color.white);
        this.hire.setActionCommand("Info");
        this.hire.setFont(font);
        this.hire.setPreferredSize(new Dimension(150,50));
        this.add(hire);


    }
    //----constructor----

    public PersonalTableRow(Prof prof, GUI gui) {
        super();
        this.gui = gui;
        this.prof = prof;
        this.setLayout(new FlowLayout());
        init();
        this.name.setText(prof.getName());
        this.costs.setText(""+ this.prof.getCosts());
        this.wellbeingBonus.setText(""+this.prof.getWellbeingBonus());
        this.benefits.setText(this.prof.getBenefits());
    }
}

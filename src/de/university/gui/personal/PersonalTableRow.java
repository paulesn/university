package de.university.gui.personal;

import de.university.data.Data;
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
    private JButton fire;
    private Data data;
    private PersonalDialog dialog;
    private Font font = new Font("Monospace", Font.BOLD, 25);
    private ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            data.deleteProf(prof);
            dialog.dispose();
            new PersonalDialog(gui);


        }
    };

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
        this.fire = new JButton("Fire");
        this.fire.setBackground(Color.gray);
        this.fire.setForeground(Color.white);
        this.fire.addActionListener(listener);
        this.fire.setActionCommand("fire");
        this.fire.setFont(font);
        this.fire.setPreferredSize(new Dimension(150,50));
        this.add(fire);
    }
    //----constructor----

    public PersonalTableRow(Prof prof, GUI gui, PersonalDialog dialog) {
        super();
        this.dialog = dialog;
        this.gui = gui;

        this.data = this.gui.getData();
        this.prof = prof;
        this.setLayout(new FlowLayout());
        init();
        this.name.setText(prof.getName());
        this.costs.setText(""+ this.prof.getCosts());
        this.wellbeingBonus.setText(""+this.prof.getWellbeingBonus());
        this.benefits.setText(this.prof.getBenefits());
    }
}

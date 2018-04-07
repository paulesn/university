package de.university.gui.personal;

import de.university.data.professors.Prof;
import de.university.gui.GUI;
import de.university.data.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HireingTableRow extends JPanel{
    //----variables----
    private GUI gui;
    private Prof prof;
    private JLabel name;
    private JLabel costs;
    private JLabel wellbeingBonus;
    private JLabel benefits;
    private JButton info;
    private JButton hire;
    private Data data;
    private HireDialog dialog;
    private PersonalDialog dialog1;
    private Font font = new Font("Monospace", Font.BOLD, 25);
    private ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("HireingTableRow 27:"+ "setProfs");
            data.setProfs(prof);
            dialog.dispose();
            dialog1.profDisplay();
            dialog1.repaint();


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
        this.hire = new JButton("Hire");
        this.hire.setBackground(Color.gray);
        this.hire.setForeground(Color.white);
        this.hire.addActionListener(listener);
        this.hire.setActionCommand("Hire");
        this.hire.setFont(font);
        this.hire.setPreferredSize(new Dimension(150,50));
        this.add(hire);


    }
    //----constructor----

    public HireingTableRow(Prof prof, GUI gui, PersonalDialog dialog1, HireDialog dialog) {
        super();
        this.gui = gui;
        this.dialog1 = dialog1;
        this.dialog = dialog;
        this.prof = prof;
        this.data = this.gui.getData();
        this.setLayout(new FlowLayout());
        init();
        this.name.setText(prof.getName());
        this.costs.setText(""+ this.prof.getCosts());
        this.wellbeingBonus.setText(""+this.prof.getWellbeingBonus());
        this.benefits.setText(this.prof.getBenefits());
    }
}

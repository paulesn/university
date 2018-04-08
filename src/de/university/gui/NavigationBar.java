package de.university.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavigationBar extends JPanel {
    //----variables----
    private GUI gui;
    private JButton up;
    private JButton down;
    private JButton left;
    private JButton rigth;
    private Font font = new Font("Monospace", Font.BOLD, 15);

    //----init----
    public void init() {
        int x = 1;
        this.setLayout(new FlowLayout());
        up = new JButton("A");
        up.setFont(font);
        up.setPreferredSize(new Dimension(70,50));
        this.add(up);
        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.movePlayGround(-x, 0);
            }
        });
        down = new JButton("V");
        down.setFont(font);
        down.setPreferredSize(new Dimension(70,50));
        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.movePlayGround(x, 0);
            }
        });
        this.add(down);
        left = new JButton("<--");
        left.setFont(font);
        left.setPreferredSize(new Dimension(70,50));
        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.movePlayGround(0, -x);
            }
        });
        this.add(left);
        rigth = new JButton("-->");
        rigth.setFont(font);
        rigth.setPreferredSize(new Dimension(70,50));
        rigth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.movePlayGround(0, x);
            }
        });
        this.add(rigth);
    }

    public NavigationBar(GUI gui) {
        super();
        this.gui = gui;
        init();
    }
}

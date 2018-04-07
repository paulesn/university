package de.university.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * this class shows the playing field for the frame
 */
public class PlayGround extends JPanel {
    //----variables---
    private GUI gui;
    private int x = 15;
    private JButton[][] field = new JButton[x][x];
    private ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //get coordinates
            int temp = Integer.parseInt(e.getActionCommand());
            int coordX = temp % x;
            int coordY = temp / x;

            //buttonPressed(coordX,coordY);
        }
    };
    private Boolean mode = false;


    //----methods----

    /**
     * changes the mode of the buttons
     * true = build mode
     * false = info mode
     * @param mode
     */
    public void setButtonMode(Boolean mode) {
        this.mode = mode;
    }

    //----constructors----
    public PlayGround(GUI gui) {
        super();
        this.gui = gui;
        this.setLayout(new GridLayout(x, x));
        for (int i = 0; i != x; ++i) {
            for (int o = 0; o != x; ++o) {
                field[i][o] = new JButton();
                field[i][o].setPreferredSize(new Dimension(20, 20));
                field[i][o].setActionCommand("" + (x * i + o));
                    /*
                    x is the size of the coord system
                    actioncommand % x = i
                    actioncommand / x = o
                     */
                this.add(field[i][o]);
            }
        }
        //init button array

    }


}

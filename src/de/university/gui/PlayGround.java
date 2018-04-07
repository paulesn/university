package de.university.gui;

import de.university.data.rooms.Room;

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
            if(mode) {
                clicked(coordX, coordY);//build
            }else{
                info(coordX, coordY);//show the info of the clicked button
            }
        }
    };
    //for building only
    private Boolean mode = false;
    private Room currentBuildRoom;
    private int currentX;
    private int currentY;

    //----methods----

    /**
     * changes the mode of the buttons
     * true = build mode
     * false = info mode
     * and marks the building spots
     * @param mode
     * @param room
     */
    public void setButtonMode(Boolean mode, Room room) {
        this.mode = mode;
        //TODO mark the building possibilitys
    }

    /**
     * first click: show the possibilitys
     * second click: build here
     * @param coordX
     * @param coordY
     */
    private void clicked(int coordX, int coordY) {
        if(currentX == coordX){
            if(currentY == coordY){
                //second click

                return;
            }
        }
        //first click
        //check possibility

        //TODO show blue
        if(true) {
            currentX = coordX;
            currentY = coordY;
        }
    }

    /**
     * shows the info of the clicked room
     * @param x
     * @param y
     */
    private void info(int x, int y){
        //TODO
    }

    //----constructors----
    public PlayGround(GUI gui) {
        super();
        this.gui = gui;
        this.setLayout(new GridLayout(x, x));
        for (int i = 0; i != x; ++i) {
            for (int o = 0; o != x; ++o) {
                field[i][o] = new JButton();
                field[i][o].setBackground(Color.lightGray);
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

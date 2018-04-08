package de.university.gui;

import de.university.control.KeyControl;
import de.university.data.Data;
import de.university.data.rooms.Room;
import de.university.gui.build.Builder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * this class shows the playing field for the frame
 */
public class PlayGround extends JPanel {
    //----variables---
    private Data data;
    private int startX;
    private int startY;
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

            coordX += startX;
            coordY += startY;
            System.out.println("PlayGround[33]: "+ mode);
            if (mode) {
                clicked(coordX, coordY);//build
            } else {
                info(coordX, coordY);//show the info of the clicked button
            }
        }
    };
    //for building only
    private Boolean mode = false;
    private Room currentBuildRoom;
    private int currentX;
    private int currentY;
    private Builder builder;

    //----methods----

    /**
     * changes the mode of the buttons
     * true = build mode
     * false = info mode
     * and marks the building spots
     *
     * @param mode
     * @param room
     */
    public void setButtonMode(Boolean mode, Room room) {
        this.mode = mode;
        this.currentBuildRoom = room;
        //TODO mark the building possibilitys
        //run through every coord with the checkposibility from Builder and the color GREEN
    }

    /**
     * first click: show the possibilitys
     * second click: build here
     *
     * @param coordX
     * @param coordY
     */
    private void clicked(int coordY, int coordX) {
        gui.clearMarking();
        if (currentX == coordX) {
            if (currentY == coordY) {
                //second click
                //check the money
                if(data.getMoney() >= currentBuildRoom.getCosts()) {
                    //build the room
                    data.setMoney(data.getMoney()-currentBuildRoom.getCosts());
                    data.build(currentBuildRoom, coordX, coordY);
                }else{
                    //not enough money
                    //TODO Message
                }
                render();
                return;
            }
        }
        //first click
        if (builder.checkPossiblity(currentBuildRoom, coordX, coordY, Color.BLUE)) {
            currentX = coordX;
            currentY = coordY;
        }
    }

    /**
     * shows the info of the clicked room
     *
     * @param x
     * @param y
     */
    private void info(int x, int y) {
        //TODO
    }

    //----constructors----
    public PlayGround(GUI gui) {
        super();
        this.gui = gui;
        this.data = gui.getData();
        this.builder = gui.getBuilder();
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
                    field[i][o].addActionListener(listener);
                this.add(field[i][o]);
            }
        }
        //init button array

    }

    //TODO maybe deleate
    public void dyeButton(int x, int y, Color c) {
        field[x][y].setBackground(c);
    }
    //TODO maybe deleate
    public void dyeBack() {
        for (int i = 0; i != x; ++i) {
            for (int o = 0; o != x; ++o) {
                field[i][o].setBackground(Color.GRAY);
            }
        }
    }

    /**
     * repaints the buttons
     */
    public void render() {
        ImageIcon[][] icons = data.getIconMap();
        for(int i = 0; i != x; ++i){
            for(int o = 0; o!= x; ++o){
                field[i][o].setIcon(icons[i+startX][o+startY]);
            }
        }
    }

    public void moveYourself(int x, int y) {
        startX = x;
        if(startX<0){
            startX = 0;
        }
        startY = y;
        if(startY<0){
            startY = 0;
        }
        render();
    }
}

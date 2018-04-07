package de.university.gui;

import de.university.control.Control;
import de.university.data.Data;
import de.university.data.rooms.Room;
import de.university.gui.build.Builder;

import javax.swing.*;
import java.awt.*;

/**
 * the main frame for the user interface
 */
public class GUI extends JFrame {
    //----variables----
    private JPanel mainPanel;
    private MenuBar menuBar;
    private PlayGround playGround;
    private Data data;
    private Builder builder;

    //----methodes----

    /**
     * changes the mode of the buttons
     * true = build mode
     * false = info mode
     * @param mode
     */
    public void setButtonMode(Boolean mode, Room room){
        //true = build mode
        //false = info mode
        playGround.setButtonMode(mode, room);
    }

    public Data getData(){
        return data;
    }

    public Builder getBuilder(){
        return builder;
    }

    /**
     * marks a specific button with a give color c
     * @param x
     * @param y
     * @param c
     */
    public void mark(int x, int y, Color c){
        //TODO mark a button
        //make icon invisible or use a dyed one
    }

    /**
     * changes all markings back to grey and resets the icons
     */
    public void clearMarking(){
        //TODO
    }

    //----constructor----
    public GUI(Data data){
        super("University");
        setBounds(100,100,1000,1000);
        this.setMinimumSize(new Dimension(1000, 1000));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel(new BorderLayout());
        this.add(mainPanel);

        this.builder = new Builder(this);
        this.data = data;

        //menuBar
        menuBar = new MenuBar(this);
        mainPanel.add(menuBar,BorderLayout.NORTH);

        //playGround
        playGround = new PlayGround(this);
        mainPanel.add(playGround,BorderLayout.CENTER);

        //----finalize----
        setVisible(true);
    }

}

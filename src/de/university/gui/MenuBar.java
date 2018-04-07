package de.university.gui;

import de.university.gui.build.BuildDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * this shows the menu panel
 */
public class MenuBar extends JPanel{
    //----variables----
    private GUI gui;
    private JPanel menuPanel;
    private JPanel resPanel;
    private Font font = new Font("Monospace", Font.BOLD, 25);


    private int numberOfButtons = 5;
    private int numberOfLabel = 5;
    private JButton[] menuButtons = new JButton[numberOfButtons];
    private JLabel[] resLabels = new JLabel[numberOfLabel];
    private ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int i = Integer.parseInt(e.getActionCommand());
            buttonPressed(i);
        }
    };


    //----methods----

    /**
     * works if one ofe the menuButtons has been pressed
     * @param i the number of the button
     */
     private void buttonPressed(int i) {
        switch(i){
            case 0: //TODO statistics
                break;
            case 1: new BuildDialog(gui);
                break;
            case 2: //TODO research
                break;
            case 3: //TODO Personal
                break;
            case 4: //TODO ESC
                break;
        } //TODO add more buttons iff we have more
     }


    //TODO method repaintResLabel(String[] data)

    //----constructor----
    public MenuBar(GUI gui){
        super();
        this.gui = gui;
        this.setLayout(new BorderLayout());

        //menu
        menuPanel = new JPanel(new FlowLayout());
        menuPanel.setBackground(Color.LIGHT_GRAY);
        menuPanel.setPreferredSize(new Dimension(1000, 50));
        menuPanel.setMinimumSize(new Dimension(1000,50));
        this.add(menuPanel,BorderLayout.NORTH);

        //add the buttons
        for(int i = 0; i!= numberOfButtons; ++i){
            menuButtons[i] = new JButton();
            menuButtons[i].setActionCommand(""+i);
            menuButtons[i].addActionListener(listener);
            menuButtons[i].setFont(font);
            menuButtons[i].setPreferredSize(new Dimension(150,50));

            menuPanel.add(menuButtons[i]);
        }
        menuButtons[0].setText("Statistics");
        menuButtons[1].setText("Build");
        menuButtons[2].setText("Research");
        menuButtons[3].setText("Personal");
        menuButtons[4].setText("Menu");



        //resLabels
        resPanel = new JPanel(new FlowLayout());
        resPanel.setBackground(Color.GRAY);
        resPanel.setPreferredSize(new Dimension(1000, 50));
        resPanel.setMinimumSize(new Dimension(1000, 50));
        this.add(resPanel,BorderLayout.SOUTH);

        //add the labels
        for(int i = 0; i!= numberOfLabel; ++i){
            resLabels[i] = new JLabel();
            resPanel.add(resLabels[i]);
        }
        //TODO
    }

}

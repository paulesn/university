package de.university.control;

import de.university.gui.GUI;

import java.awt.*;
import java.awt.event.*;

public class KeyControl extends KeyAdapter {
    private GUI gui;

    public KeyControl(GUI gui) {
        this.gui = gui;
    }


    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key: "+e.getKeyCode());
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
              gui.movePlayGround(0,1);
                break;
            case KeyEvent.VK_DOWN:
                gui.movePlayGround(0,-1);
                break;
            case KeyEvent.VK_LEFT:
                gui.movePlayGround(1,0);
                break;
            case KeyEvent.VK_RIGHT:
                gui.movePlayGround(-1,0);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

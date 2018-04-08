package de.university.control;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl extends JFrame implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP: //TODO
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

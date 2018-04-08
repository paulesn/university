package de.university.connect;

import de.university.gui.GUI;

import java.io.IOException;
import java.net.Socket;

public class Connect {
    //----variables----
    private Socket socket;
    private GUI gui;

    //----methods----

    //----constructor----
    public Connect(GUI gui){
    }

    private void render(){
        gui.render();
    }
}

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
        this.gui = gui;
        try {
            socket = new Socket("52.170.119.223",5565);
        } catch (IOException e) {
        }
        socket.
    }
}

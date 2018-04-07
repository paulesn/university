package de.university.gui;

import de.university.data.rooms.Room;

import javax.swing.*;

public class Icons {

    public static ImageIcon get(int y, int x, Room room){
        String path = room.getPath()+"-"+x+"-"+y+".png";
        ImageIcon icon = new ImageIcon(path);
        return icon;
    }
}

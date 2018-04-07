package de.university.gui;

import de.university.data.rooms.Room;

import javax.swing.*;
import java.lang.reflect.Array;

public class Icons {

    public static ImageIcon get(int y, int x, Room room){
        ImageHandler image = new ImageHandler();

        int sizex;
        int sizey;

        switch(room.getSize()) {
            case MICRO:
                ImageHandler image = new ImageHandler(1,1,room.getPath());
                sizex=1;
                sizey=1;
                break;
            case SMALL:
                ImageHandler image = new ImageHandler(1,2,room.getPath());
                sizex=1;
                sizey=2;
                break;
            case NORMAL:
                ImageHandler image = new ImageHandler(2,2,room.getPath());
                sizex=2;
                sizey=2;
                break;
            case MEDIUM:
                ImageHandler image = new ImageHandler(2,3,room.getPath());
                sizex=2;
                sizey=3;
                break;
            case BIG:
                ImageHandler image = new ImageHandler(3,3,room.getPath());
                sizex=3;
                sizey=3;
                break;
            case BIGGER:
                ImageHandler image = new ImageHandler(4,4,room.getPath());
                sizex=4;
                sizey=4;
                break;
            case GIGANTIC:
                ImageHandler image = new ImageHandler(5,5,room.getPath());
                sizex=5;
                sizey=5;
                break;
        }

        image.getImagePiece(y,x);
        String path=room.getPath()+"-"+x"-"+y+".png";
        ImageIcon icon = new ImageIcon(path);
        return icon;
    }
}

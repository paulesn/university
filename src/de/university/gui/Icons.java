package de.university.gui;

import de.university.data.rooms.Room;

import javax.swing.*;
import java.lang.reflect.Array;

public class Icons {

    public static ImageIcon get(int y, int x, Room room){
        int sizex;
        int sizey;
        ImageIcon picture= new ImageIcon(room.getPath());
        ImageHandler image;
        switch(room.getSize()) {
            case MICRO:
                image = new ImageHandler(1,1,picture);
                sizex=1;
                sizey=1;
                return image.getImagePiece(y,x);
            case SMALL:
                image = new ImageHandler(1,2,picture);
                sizex=1;
                sizey=2;
                return image.getImagePiece(y,x);
            case NORMAL:
                image = new ImageHandler(2,2,picture);
                sizex=2;
                sizey=2;
                return image.getImagePiece(y,x);
            case MEDIUM:
                image = new ImageHandler(2,3,picture);
                sizex=2;
                sizey=3;
                return image.getImagePiece(y,x);
            case BIG:
                image = new ImageHandler(3,3,picture);
                sizex=3;
                sizey=3;
                return image.getImagePiece(y,x);
            case BIGGER:
                image = new ImageHandler(4,4,picture);
                sizex=4;
                sizey=4;
                return image.getImagePiece(y,x);
            default:
                image = new ImageHandler(5,5,picture);
                sizex=5;
                sizey=5;
                return image.getImagePiece(y,x);
        }
    }
}

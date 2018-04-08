package de.university.gui;

import de.university.data.rooms.Room;

import javax.swing.*;
import java.lang.reflect.Array;

public class Icons {

    public static ImageIcon get(int x, int y, Room room){
        ImageIcon picture= new ImageIcon(room.getPath());
        ImageHandler image;
        System.out.println(picture.toString());
        switch(room.getSize()) {
            case MICRO:
                image = new ImageHandler(1, 1, picture);
                break;
            case SMALL:
                image = new ImageHandler(1, 2, picture);
                break;
            case NORMAL:
                image = new ImageHandler(2, 2, picture);
                break;
            case MEDIUM:
                image = new ImageHandler(2, 3, picture);
                break;
            case BIG:
                image = new ImageHandler(3, 3, picture);
                break;
            case BIGGER:
                image = new ImageHandler(4, 4, picture);
                break;
            default:
                image = new ImageHandler(5, 5, picture);
                break;
        }
        return image.getImagePiece(x,y);

    }
}

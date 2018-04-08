package de.university.gui;

import de.university.data.rooms.Room;

import javax.swing.*;
import java.lang.reflect.Array;

public class Icons {

    public static ImageIcon get(int y, int x, Room room){
        ImageIcon picture= new ImageIcon(room.getPath());
        ImageHandler image;
        System.out.println(picture.toString());
        switch(room.getSize()) {
            case SMALL:
                image = new ImageHandler(1, 2, picture);
                System.out.println(image.getImagePiece(x,y));
                return image.getImagePiece(x,y);
            case NORMAL:
                image = new ImageHandler(2, 2, picture);
                System.out.println(image.getImagePiece(x,y));
                return image.getImagePiece(x,y);
            case MEDIUM:
                image = new ImageHandler(2, 3, picture);
                System.out.println(image.getImagePiece(x,y));
                return image.getImagePiece(x,y);
            case BIG:
                image = new ImageHandler(3, 3, picture);
                System.out.println(image.getImagePiece(x,y));
                return image.getImagePiece(x,y);
            case BIGGER:
                image = new ImageHandler(4, 4, picture);
                System.out.println(image.getImagePiece(x,y));
                return image.getImagePiece(x,y);
            case GIGANTIC:
                image = new ImageHandler(5, 5, picture);
                System.out.println(image.getImagePiece(x,y));
                return image.getImagePiece(x,y);
            default:
                return picture;
        }

    }
}

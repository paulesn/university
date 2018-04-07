package de.university.gui.build;

import de.university.data.Data;
import de.university.data.rooms.Dirt;
import de.university.data.rooms.Room;
import de.university.gui.GUI;

import java.awt.*;

public class Builder {
    //----variables----
    private GUI gui;
    private Data data;

    //----methods----

    public Boolean checkPossiblity(Room room, int x, int y, Color validColor) {
        Boolean temp = true;
        switch (room.getSize()) {
            //there are no breaks because the bigger ones use the smaller ones
            case GIGANTIC:
                for(int i = 0; i != 5;++i){
                    if (data.getBuilding(x+4, y+i).getClass() == new Dirt().getClass()) {
                        gui.mark(x+4, y+i, validColor);
                    }else {
                        temp = false;
                        gui.mark(x+4, y+i, Color.RED);
                    }
                }
                for(int i = 0; i != 4;++i){
                    if (data.getBuilding(x+i, y+4).getClass() == new Dirt().getClass()) {
                        gui.mark(x+i, y+4, validColor);
                    }else {
                        temp = false;
                        gui.mark(x+i, y+4, Color.RED);
                    }
                }
            case BIGGER:
                for(int i = 0; i != 4;++i){
                    if (data.getBuilding(x+3, y+i).getClass() == new Dirt().getClass()) {
                        gui.mark(x+3, y+i, validColor);
                    }else {
                        temp = false;
                        gui.mark(x+3, y+i, Color.RED);
                    }
                }
                for(int i = 0; i != 3;++i){
                    if (data.getBuilding(x+i, y+3).getClass() == new Dirt().getClass()) {
                        gui.mark(x+i, y+3, validColor);
                    }else {
                        temp = false;
                        gui.mark(x+i, y+3, Color.RED);
                    }
                }
            case BIG:
                //the last colum
                if (data.getBuilding(x+2, y).getClass() == new Dirt().getClass()) {
                    gui.mark(x+2, y, validColor);
                }else {
                    temp = false;
                    gui.mark(x+2, y, Color.RED);
                }
                //--------------
                if (data.getBuilding(x+2, y+1).getClass() == new Dirt().getClass()) {
                    gui.mark(x+2, y+1, validColor);
                }else {
                    temp = false;
                    gui.mark(x+2, y+1, Color.RED);
                }
                //-------------
                if (data.getBuilding(x+2, y+2).getClass() == new Dirt().getClass()) {
                    gui.mark(x+2, y+2, validColor);
                }else {
                    temp = false;
                    gui.mark(x+2, y+2, Color.RED);
                }
                //the first two of the last row
                if (data.getBuilding(x, y+2).getClass() == new Dirt().getClass()) {
                    gui.mark(x, y+2, validColor);
                }else {
                    temp = false;
                    gui.mark(x, y+2, Color.RED);
                }
                //----------
                if (data.getBuilding(x+1, y+2).getClass() == new Dirt().getClass()) {
                    gui.mark(x+1, y+2, validColor);
                }else {
                    temp = false;
                    gui.mark(x+1, y+2, Color.RED);
                }



            case NORMAL:
                //the two below the following
                if (data.getBuilding(x, y+1).getClass() == new Dirt().getClass()) {
                    gui.mark(x, y+1, validColor);
                }else {
                    temp = false;
                    gui.mark(x, y+1, Color.RED);
                }
                //---------------------
                if (data.getBuilding(x+1, y+1).getClass() == new Dirt().getClass()) {
                    gui.mark(x+1, y+1, validColor);
                }else {
                    temp = false;
                    gui.mark(x+1, y+1, Color.RED);
                }

            case SMALL:
                //the one right next to the one you clicked at
                if (data.getBuilding(x+1, y).getClass() == new Dirt().getClass()) {
                    gui.mark(x+1, y, validColor);
                }else {
                    temp = false;
                    gui.mark(x+1, y, Color.RED);
                }

            case MICRO:
                //the one you clicked at
                if (data.getBuilding(x, y).getClass() == new Dirt().getClass()) {
                    gui.mark(x, y, validColor);
                }else {
                    temp = false;
                    gui.mark(x, y, Color.RED);
                }

        }
        return temp;
    }


    //----constructor----
    public Builder(GUI gui) {
        this.gui = gui;
        this.data = gui.getData();
    }
}

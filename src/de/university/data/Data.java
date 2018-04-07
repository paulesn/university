package de.university.data;

import de.university.data.rooms.Room;
import de.university.data.professors.Prof;

public class Data {
    //----variables----
    private Room[][] map;
    
    private Prof[] profs;

    //----methods----

    //----constructors----
    public Data(int size){
        map = new Room[size][size];
    }
}

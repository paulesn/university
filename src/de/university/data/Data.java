package de.university.data;

import de.university.data.rooms.Room;

public class Data {
    //----variables----
    private Room[][] map;

    //----methods----

    //----constructors----
    public Data(int size){
        map = new Room[size][size];
    }
}

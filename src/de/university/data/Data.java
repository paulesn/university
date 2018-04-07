package de.university.data;

import de.university.data.rooms.Dirt;
import de.university.data.rooms.Room;
import de.university.data.professors.Prof;
import de.university.gui.GUI;

import java.util.ArrayList;

public class Data {
    //----variables----
    private GUI gui;
    private Room[][] map;
    private ArrayList<Prof> profs = new ArrayList<Prof>();
    private ArrayList<Room> buildings = new ArrayList<Room>();
    private int money = 10000000;
    //----methods----

    public void addGUI(GUI gui){
        this.gui = gui;
    }

    /**
     * returns the building on the specific coordinates x and y
     *
     * @param x
     * @param y
     * @return
     */
    public Room getBuilding(int x, int y) {
        return map[x][y];
    }

    /**
     * builds the room
     * adds it on the map
     * adds it to the building list
     *
     * @param room
     * @param x
     * @param y
     */
    public void build(Room room, int x, int y) {
        Room clone = new Room(room);
        buildings.add(clone);
        System.out.println("DATA[37]: "+buildings.toString());
        switch (room.getSize()) {
            //there are no breaks because the bigger ones use the smaller ones
            case GIGANTIC:
                for (int i = 0; i != 5; ++i) {
                    map[x+4][y+i] = clone;
                }
                for (int i = 0; i != 4; ++i) {
                    map[x+i][y+4] = clone;
                }
            case BIGGER:
                for (int i = 0; i != 4; ++i) {
                    map[x+3][y+i] = clone;
                }
                for (int i = 0; i != 3; ++i) {
                    map[x+i][y+3] = clone;
                }
            case BIG:
                //the last colum
                map[x+2][y] = clone;
                //--------------
                map[x+2][y+1] = clone;
                //-------------
                map[x+2][y+2] = clone;
                //the first two of the last row
                map[x][y+2] = clone;
                //----------
                map[x+1][y+2] = clone;
            case NORMAL:
                //the two below the following
                map[x][y+1] = clone;
                //---------------------
                map[x+1][y+1] = clone;

            case SMALL:
                //the one right next to the one you clicked at
                map[x + 1][y] = clone;
            case MICRO:
                //the one you clicked at
                map[x][y] = clone;
        }
       gui.setButtonMode(false,null);
    }

    //----constructors----
    public Data(int size) {
        map = new Room[size][size];
        for(int i = 0; i != size; ++i){
            for(int o = 0; o != size; ++o){
                map[i][o] = new Dirt();
            }
        }
    }

    //----getter-setter----
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * return arraylist of professors
     * @return
     */
    public ArrayList<Prof> getProfs(){
        return profs;
    }

    /**
     * add professor to arraylist
     * @param prof
     */
    public void setProfs(Prof prof){
        this.profs.add(prof);
    }

    /**
     * removes a professor from the arraylist
     * @param prof
     */
    public void deleteProf(Prof prof) {
        this.profs.remove(prof);
    }

    /**
     * returns the current professor capacity
     * @return Integer
     */
    public Integer currentProfCapacity(){
        Integer currentProfCapacity = 0;
        if(!buildings.isEmpty()){
            for (Room room: buildings) {
                currentProfCapacity += room.getProfCapacity();
            }
        }
        return currentProfCapacity;
    }

    /**
     * returns the current Student capacity
     * @return Integer
     */
    public Integer currentStudentCapacity(){
        Integer currentStudentCapacity = 0;
        if(!buildings.isEmpty()){
            for (Room room: buildings) {
                currentStudentCapacity += room.getStudentCapacity();
            }
        }
        return currentStudentCapacity;
    }

    public Integer currentWellbeingCapacity(){
        Integer currentWellbeingCapacity = 0;
        if(!buildings.isEmpty()){
            for (Room room: buildings) {
                currentWellbeingCapacity += room.getWellbeingBonus();
            }
        }
        return currentWellbeingCapacity;
    }


}

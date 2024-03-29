package de.university.data;

import de.university.data.rooms.Dirt;
import de.university.data.rooms.Room;
import de.university.data.professors.Prof;
import de.university.gui.GUI;
import de.university.gui.Icons;

import javax.swing.*;
import java.util.ArrayList;

public class Data {
    //----variables----
    private GUI gui;
    private Room[][] map;
    private ImageIcon[][] iconMap;
    private ArrayList<Prof> profs = new ArrayList<Prof>();
    private ArrayList<Room> buildings = new ArrayList<Room>();
    private int money = 18000;
    private final int size;
    private int currentNumberOfStudents;
    //----methods----

    public void addGUI(GUI gui) {
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

        switch (room.getSize()) {
            //there are no breaks because the bigger ones use the smaller ones
            case GIGANTIC:
                for (int i = 0; i != 5; ++i) {
                    map[x + 4][y + i] = clone;
                    iconMap[x+4][y+i] = Icons.get(4,i,room);
                }
                for (int i = 0; i != 4; ++i) {
                    map[x + i][y + 4] = clone;
                    iconMap[x+i][y+4] = Icons.get(i,4,room);
                }
            case BIGGER:
                for (int i = 0; i != 4; ++i) {
                    map[x + 3][y + i] = clone;
                    iconMap[x+3][y+i] = Icons.get(3,i,room);
                }
                for (int i = 0; i != 3; ++i) {
                    map[x + i][y + 3] = clone;
                    iconMap[x+i][y+3] = Icons.get(i,3,room);
                }
            case BIG:
                //the last colum
                map[x + 2][y] = clone;
                iconMap[x+2][y] = Icons.get(2,0,room);
                //--------------
                map[x + 2][y + 1] = clone;
                iconMap[x+2][y+1] = Icons.get(2,1,room);
                //-------------
                map[x + 2][y + 2] = clone;
                iconMap[x+2][y+2] = Icons.get(2,2,room);
                //the first two of the last row
                map[x][y + 2] = clone;
                iconMap[x][y+2] = Icons.get(0,2,room);
                //----------
                map[x + 1][y + 2] = clone;
                iconMap[x+1][y+2] = Icons.get(1,2,room);
            case NORMAL:
                //the two below the following
                map[x][y + 1] = clone;
                iconMap[x][y+1] = Icons.get(0,1,room);
                //---------------------
                map[x + 1][y + 1] = clone;
                iconMap[x+1][y+1] = Icons.get(1,1,room);

            case SMALL:
                //the one right next to the one you clicked at
                map[x + 1][y] = clone;
                iconMap[x+1][y] = Icons.get(1,0,room);
            case MICRO:
                //the one you clicked at
                map[x][y] = clone;
                iconMap[x][y] = Icons.get(0,0,room);
        }
        gui.setButtonMode(false, null);
        gui.render();
    }

    public void increaseStudents(){
        currentNumberOfStudents+= currentWellbeingCapacity();
        int temp = (int)(Math.random()*100);
        currentNumberOfStudents -= temp;
        if(currentNumberOfStudents>currentStudentCapacity()){
            currentNumberOfStudents = currentStudentCapacity();
        }
        if(currentNumberOfStudents<0){
            currentNumberOfStudents = 0;
        }
    }

    public GUI getGui() {
        return gui;
    }

    public void setGui(GUI gui) {
        this.gui = gui;
    }

    public Room[][] getMap() {
        return map;
    }

    public void setMap(Room[][] map) {
        this.map = map;
    }

    public ImageIcon[][] getIconMap() {
        return iconMap;
    }

    public void setIconMap(ImageIcon[][] iconMap) {
        this.iconMap = iconMap;
    }

    public void setProfs(ArrayList<Prof> profs) {
        this.profs = profs;
    }

    public ArrayList<Room> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Room> buildings) {
        this.buildings = buildings;
    }

    //----constructors----
    public Data(int size) {
        this.size = size;
        map = new Room[size][size];
        iconMap = new ImageIcon[size][size];
        for (int i = 0; i != size; ++i) {
            for (int o = 0; o != size; ++o) {
                map[i][o] = new Dirt();
            }
        }
    }

    //----getter-setter----


    public int getSize() {
        return size;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void payDept(){
       money += 10*currentNumberOfStudents;
       money -= 500*profs.size();
    }

    /**
     * return arraylist of professors
     *
     * @return
     */
    public ArrayList<Prof> getProfs() {
        return profs;
    }

    /**
     * add professor to arraylist
     *
     * @param prof
     */
    public void setProfs(Prof prof) {
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


    public Integer currentNumberOfStudents() {
        return currentNumberOfStudents;
    }
}

package de.university.data.rooms;

import de.university.data.RoomSize;

public class Room {
    //----variables----
    private String name;
    private int costs;
    private RoomSize size;
    private int knowledgeBonus;
    private int wellbeingBonus;
    private int studentCapacity;
    private int profCapacity;
    private String benefits;
    private String info;
    private String path;

    //----getter-setter----


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public RoomSize getSize() {
        return size;
    }

    public void setSize(RoomSize size) {
        this.size = size;
    }

    public int getKnowledgeBonus() {
        return knowledgeBonus;
    }

    public void setKnowledgeBonus(int knowledgeBonus) {
        this.knowledgeBonus = knowledgeBonus;
    }

    public int getWellbeingBonus() {
        return wellbeingBonus;
    }

    public void setWellbeingBonus(int wellbeingBonus) {
        this.wellbeingBonus = wellbeingBonus;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public int getProfCapacity() {
        return profCapacity;
    }

    public void setProfCapacity(int profCapacity) {
        this.profCapacity = profCapacity;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    //----methods----

    /**
     * clone constructor
     * @param room
     */
    public Room(Room room){
        this.setName(room.getName());
        this.setCosts(room.getCosts());
        this.setSize(room.getSize());
        this.setKnowledgeBonus(room.getKnowledgeBonus());
        this.setWellbeingBonus(room.getWellbeingBonus());
        this.setStudentCapacity(room.getStudentCapacity());
        this.setProfCapacity(room.getProfCapacity());
        this.setBenefits(room.getBenefits());
        this.setInfo(room.getInfo());
        this.setPath(room.getPath());
    }

    public Room(){

    }
}

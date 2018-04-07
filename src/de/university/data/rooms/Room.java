package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Room {
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

    //----getter-setter----

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

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    //----methods----

}

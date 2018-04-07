package de.university.data.rooms;

import de.university.data.RoomSize;

public class Dirt extends Room{
    //----constructor----

    public Dirt(){
        this.setName("Buero");
        this.setCosts(0);
        this.setSize(RoomSize.MICRO);
        this.setKnowledgeBonus(0);
        this.setWellbeingBonus(0);
        this.setStudentCapacity(0);
        this.setProfCapacity(0);
        this.setBenefits("");
        this.setInfo("just boring dirt");
    }
}

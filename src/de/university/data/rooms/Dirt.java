package de.university.data.rooms;

import de.university.data.RoomSize;

public class Dirt extends Room{
    //----constructor----

    public Dirt(){
        this.setName("Dirt");
        this.setCosts(0);
        this.setSize(RoomSize.MICRO);
        this.setKnowledgeBonus(0);
        this.setWellbeingBonus(0);
        this.setStudentCapacity(0);
        this.setProfCapacity(0);
        this.setBenefits("");
        this.setInfo("Just boring dirt");
        this.setPath("university/src/de/university/extern/Dirt.png");
    }
}

package de.university.data.rooms;

import de.university.data.RoomSize;

public class Mensa extends Room{
    //----constructor----
	
	public Mensa(){
		this.setName("Mensa");
		this.setCosts(7000);
		this.setSize(RoomSize.GIGANTIC);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(20);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("For students to eat. Increases the points of wellbeing by " + this.getWellbeingBonus()  + ".\nCosts: " + this.getCosts());
		this.setPath("university/src/de/university/extern/Mensa.png");
	}
}

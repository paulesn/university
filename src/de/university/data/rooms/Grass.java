package de.university.data.rooms;

import de.university.data.RoomSize;

public class Grass extends Room{
    //----constructor----
	
	public Grass(){
		this.setName("Grass area");
		this.setCosts(500);
		this.setSize(RoomSize.MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(5);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Increases the points for wellbeing by " + this.getWellbeingBonus()  + ".\nCosts: " + this.getCosts());
	}
}

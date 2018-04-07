package de.university.data.rooms;

import de.university.data.RoomSize;

public class Buero extends Room{
    //----constructor----
	
	public Buero(){
		this.setName("Buero");
		this.setCosts(1500);
		this.setSize(RoomSize.MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(0);
		this.setStudentCapacity(0);
		this.setProfCapacity(1);
		this.setBenefits("");
		this.setInfo("Needed to be able to hire a new professor.\nCosts: " + this.getCosts());
	}
}

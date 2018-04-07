package de.university.data.rooms;

import de.university.data.RoomSize;

public class Hallway extends Room{
    //----constructor----
	
	public Hallway(){
		this.setName("Hallway");
		this.setCosts(100));
		this.setSize(RoomSize.MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(0);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Used to connect different rooms.\nCosts: " + this.getCosts());
	}
}

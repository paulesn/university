package de.university.data.rooms;

import de.university.data.RoomSize;

public class Buecherei extends Room{
    //----constructor----
	
	public Buecherei(){
		this.setName("Library");
		this.setCosts(8000);
		this.setSize(RoomSize.BIGGER);
		this.setKnowledgeBonus(20);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("For students to learn. Increases the points for knowledge by " + this.getKnowledgeBonus() +" and the points for wellbeing by " + this.getWellbeingBonus() + ".\nCosts:: " + this.getCosts());
		this.setPath("de/university/extern/Bibliothek.png");
	}
}

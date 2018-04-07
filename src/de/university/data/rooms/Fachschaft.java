package de.university.data.rooms;

import de.university.data.RoomSize;

public class Fachschaft extends Room{
    //----constructor----
	
	public Fachschaft(){
		this.setName("Student Council");
		this.setCosts(2500);
		this.setSize(RoomSize.NORMAL);
		this.setKnowledgeBonus(5);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Gives students the ability to get old tests and relax. Increases the points for knowledge by " + this.getKnowledgeBonus() + " and the points for wellbeing by " + this.getWellbeingBonus()  + ".\nCosts: " + this.getCosts());
	}
}

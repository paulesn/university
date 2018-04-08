package de.university.data.rooms;

import de.university.data.RoomSize;

public class Hoersaal extends Room{
    //----constructor----
	
	public Hoersaal(){
		this.setName("Lecture hall");
		this.setCosts(6000);
		this.setSize(RoomSize.BIGGER);
		this.setKnowledgeBonus(15);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(500);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Used for instruction. Increases the points for knowledge by " + this.getKnowledgeBonus() + ", the points for wellbeing by " + this.getWellbeingBonus()+ " and the capacity of university students by " + this.getStudentCapacity() + ".\nCosts: " + this.getCosts());
		this.setPath("de/university/extern/Hörsaal.png");
	}
}

package de.university.data.rooms;

import de.university.data.RoomSize;

public class SeminarRoom extends Room{
    //----constructor----
	
	public SeminarRoom(){
		this.setName("Seminar room");
		this.setCosts(1500);
		this.setSize(RoomSize.NORMAL);
		this.setKnowledgeBonus(10);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("For teaching smaller groups of students. Increases the points for knowledge by " + this.getKnowledgeBonus() + " and the points for wellbeing by " this.getWellbeingBonus()  + ".\nCosts: " + this.getCosts());
	}
}

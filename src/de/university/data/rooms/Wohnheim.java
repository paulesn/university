package de.university.data.rooms;

import de.university.data.RoomSize;

public class Wohnheim extends Room{
    //----constructor----
	
	public Wohnheim(){
		this.setName("Wohnheim");
		this.setCosts(8000);
		this.setSize(RoomSize.GIGANTIC);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(40);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient dem Studenten zum Wohnen. Erhoet die Wohlfühlpunkte um "+ this.getWellbeingBonus() + ".\nKostet: " + this.getCosts());
	}
}

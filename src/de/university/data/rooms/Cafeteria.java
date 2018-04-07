package de.university.data.rooms;

import de.university.data.RoomSize;

public class Cafeteria extends Room{
    //----constructor----
	
	public Cafeteria(){
		this.setName("Cafeteria");
		this.setCosts(4000);
		this.setSize(RoomSize.BIG);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(20);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient den Studenten zum Essen. Erhoet die Wohlfühlpunkte um " + this.getWellbeingBonus() + ".\nKostet: " + this.getCosts());
	}
}

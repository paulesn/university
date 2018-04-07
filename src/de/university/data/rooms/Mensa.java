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
		this.setInfo("Dient dem Studenten zum Essen. Erhoet die Wohlfühlpunkte um " + this.getWellbeingBonus()  + ".\nKostet: " + this.getCosts());
	}
}

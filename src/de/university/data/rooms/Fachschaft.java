package de.university.data.rooms;

import de.university.data.RoomSize;

public class Fachschaft extends Room{
    //----constructor----
	
	public Fachschaft(){
		this.setName("Fachschaft");
		this.setCosts(2500);
		this.setSize(RoomSize.NORMAL);
		this.setKnowledgeBonus(5);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient den Studenten zum Ausleihen von Klausuren und zum Entspannen. Erhoet die Wissenspunkte um " + this.getKnowledgeBonus() + " und die Wohlfühlpunkte um " + this.getWellbeingBonus()  + ".\nKostet: " + this.getCosts());
	}
}

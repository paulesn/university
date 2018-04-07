package de.university.data.rooms;

import de.university.data.RoomSize;

public class Computerpool extends Room{
    //----constructor----
	
	public Computerpool(){
		this.setName("Computerpool");
		this.setCosts(6000);
		this.setSize(RoomSize.BIG);
		this.setKnowledgeBonus(15);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient den Studenten zum Lernen mit Hilfe von Computern. Erhoet die Wissenspunkte um " + this.getKnowledgeBonus() +" und die Wohlf�hlpunkte um " + this.getWellbeingBonus()  + ".\nKostet: " + this.getCosts());
	}
}

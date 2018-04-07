package de.university.data.rooms;

import de.university.data.RoomSize;

public class Bibliothek extends Room{
    //----constructor----
	
	public Bibliothek(){
		this.setName("Bibliothek");
		this.setCosts(8000);
		this.setSize(RoomSize.BIGGER);
		this.setKnowledgeBonus(20);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient dem Studenten zum Lernen. Erhoet die Wissenspunkte um " + this.getKnowledgeBonus() +" und die Wohlf�hlpunkte um " + this.getWellbeingBonus() + ".\nKostet: " + this.getCosts());
	}
}

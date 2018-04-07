package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Lernraum extends Rooms{
    //----constructor----
	
	public Lernraum{
		this.setName("Lernraum");
		this.setCosts(1000);
		this.setSize(SMALL);
		this.setKnowledgeBonus(5);
		this.setWellbeingBonus(5);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient dem Studenten zum Lernen. Erhoet die Wissenspunkte um 5 und die Wohlfühlpunkte um 5.")

}

package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Fachschaft extends Rooms{
    //----constructor----
	
	public Fachschaft{
		this.setName("Fachschaft");
		this.setCosts(2500);
		this.setSize(NORMAL);
		this.setKnowledgeBonus(5);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient den Studenten zum Ausleihen von Klausuren und zum Entspannen. Erhoet die Wissenspunkte um 50 und die Wohlfühlpunkte um 10.")

}

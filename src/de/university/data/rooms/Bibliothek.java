package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Bibliothek extends Rooms{
    //----constructor----
	
	public Bibliothek{
		this.setName("Bibliothek");
		this.setCosts(8000);
		this.setSize(BIGGER);
		this.setKnowledgeBonus(20);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient dem Studenten zum Lernen. Erhoet die Wissenspunkte um 20 und die Wohlfühlpunkte um 10.")

}

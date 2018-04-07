package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Computerpool extends Rooms{
    //----constructor----
	
	public Computerpool{
		this.setName("Computerpool");
		this.setCosts(6000);
		this.setSize(BIG);
		this.setKnowledgeBonus(15);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient den Studenten zum Lernen mit Hilfe von Computern. Erhoet die Wissenspunkte um 15 und die Wohlfühlpunkte um 10.")

}

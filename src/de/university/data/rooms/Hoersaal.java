package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Hoersaal extends Rooms{
    //----constructor----
	
	public Hoersaal{
		this.setName("Hoersaal");
		this.setCosts(6000);
		this.setSize(BIGGER);
		this.setKnowledgeBonus(15);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(500);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient dem Studenten zum Lernen. Erhoet die Wissenspunkte um 150, die Wohlfühlpunkte um 10 und die Kapazitaet der Studenten der Universitaet um 500.")

}

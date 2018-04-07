package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Seminarraum extends Rooms{
    //----constructor----
	
	public Seminarraum{
		this.setName("Seminarraum");
		this.setCosts(1500);
		this.setSize(NORMAL);
		this.setKnowledgeBonus(10);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient dem Studenten zum Lernen. Erhoet die Wissenspunkte um 10 und die Wohlfühlpunkte um 10. Kostet: 1500")

}

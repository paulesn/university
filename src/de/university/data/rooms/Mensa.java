package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Mensa extends Rooms{
    //----constructor----
	
	public Mensa{
		this.setName("Mensa");
		this.setCosts(7000);
		this.setSize(GIGANTIC);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(20);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient dem Studenten zum Essen. Erhoet die Wohlfühlpunkte um 20. Kostet: 7000")

}

package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Parkplatz extends Rooms{
    //----constructor----
	
	public Parkplatz{
		this.setName("Parkplatz");
		this.setCosts(8000);
		this.setSize(GIGANTIC);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(30);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient den Studenten zum Parken.")

}

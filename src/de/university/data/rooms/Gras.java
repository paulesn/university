package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Gras extends Rooms{
    //----constructor----
	
	public Gras{
		this.setName("Gruenflaeche");
		this.setCosts(500);
		this.setSize(MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(5);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient zum erhoehen der Wohlfuelpunkte um 5.")

}

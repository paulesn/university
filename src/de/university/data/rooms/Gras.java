package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Gras extends Room{
    //----constructor----
	
	public Gras(){
		this.setName("Gruenflaeche");
		this.setCosts(500);
		this.setSize(RoomSize.MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(5);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient zum erhoehen der Wohlfuehlpunkte um " + this.getWellbeingBonus()  + ".\nKostet: " + this.getCosts())

}

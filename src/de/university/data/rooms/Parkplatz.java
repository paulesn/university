package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Parkplatz extends Room{
    //----constructor----
	
	public Parkplatz(){
		this.setName("Parkplatz");
		this.setCosts(8000);
		this.setSize(RoomSize.GIGANTIC);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(30);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient den Studenten zum Parken. Erhoeht die Wohlfuehlpunkte um " + this.getWellbeingBonus()  + ".\nKostet: " + this.getCosts())

}

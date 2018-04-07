package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Cafeteria extends Rooms{
    //----constructor----
	
	public Cafeteria{
		this.setName("Cafeteria");
		this.setCosts(4000);
		this.setSize(BIG);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(20);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient den Studenten zum Essen. Erhoet die Wohlfühlpunkte um 20.")

}

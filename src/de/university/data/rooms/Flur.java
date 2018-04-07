package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Flur extends Rooms{
    //----constructor----
	
	public Flur{
		this.setName("Flur");
		this.setCosts(100));
		this.setSize(MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(0);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits(0);
		this.setInfo("Dient zum verbinden der verschiedenen Raeumen.")

}

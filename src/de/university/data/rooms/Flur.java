package de.university.data.rooms;

import de.university.data.RoomSize;

public class Flur extends Room{
    //----constructor----
	
	public Flur(){
		this.setName("Flur");
		this.setCosts(100);
		this.setSize(RoomSize.MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(0);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient zum verbinden der verschiedenen Raeumen.\nKostet: " + this.getCosts());
	}
}

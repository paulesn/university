package de.university.data.rooms;

import de.university.data.RoomSize;

public class Flur extends Room{
    //----constructor----

	public Flur(){
		this.setName("Hallway");
		this.setCosts(100);
		this.setSize(RoomSize.MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(0);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("To connect rooms.\nCosts: " + this.getCosts());
		this.setPath("university/src/de/university/extern/Flur.png");
	}
}

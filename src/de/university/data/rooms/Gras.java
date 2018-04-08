package de.university.data.rooms;

import de.university.data.RoomSize;

public class Gras extends Room{
    //----constructor----
	
	public Gras(){
		this.setName("Gras area");
		this.setCosts(500);
		this.setSize(RoomSize.MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(5);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Increases the points for wellbeing by " + this.getWellbeingBonus()  + ".\nCosts: " + this.getCosts());
		this.setPath("/university/src/de/university/extern/Grünfläche.png");
	}
}

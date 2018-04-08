package de.university.data.rooms;

import de.university.data.RoomSize;

public class Wohnheim extends Room{
    //----constructor----
	
	public Wohnheim(){
		this.setName("Wohnheim");
		this.setCosts(8000);
		this.setSize(RoomSize.GIGANTIC);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(40);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("A building containing living quarters for students. Increases the points for wellbeing by "+ this.getWellbeingBonus() + ".\nCosts: " + this.getCosts());
		this.setPath("datas/Wohnheim.png");
	}
}

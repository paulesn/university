package de.university.data.rooms;

import de.university.data.RoomSize;

public class ComputerPool extends Room{
    //----constructor----
	
	public ComputerPool(){
		this.setName("Computer room");
		this.setCosts(6000);
		this.setSize(RoomSize.BIG);
		this.setKnowledgeBonus(15);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Gives the students the oportuinity to study with computers. Increases the points for knowledge by " + this.getKonwledgeBonus() +" and the points for wellbeing by " + this.getWellbeingBonus()  + ".\nCosts:: " + this.getCosts());
	}
}

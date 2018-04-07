package de.university.data.rooms;

import de.university.data.RoomSize;

public class LerningSpace extends Room{
    //----constructor----
	
	public LerningSpace(){
		this.setName("Lerning space);
		this.setCosts(1000);
		this.setSize(RoomSize.SMALL);
		this.setKnowledgeBonus(5);
		this.setWellbeingBonus(5);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Used by students for studying. Increases the points for knowledge by " + this.getKnowledgeBonus() + " and the points for wellbeing by " + this.getWellbeingBonus()  + ".\nCosts: " + this.getCosts());
	}
}
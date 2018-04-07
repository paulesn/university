package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Buero extends Room{
    //----constructor----
	
	public Buero(){
		this.setName("Buero");
		this.setCosts(1500);
		this.setSize(RoomSize.MICRO);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(0);
		this.setStudentCapacity(0);
		this.setProfCapacity(1);
		this.setBenefits("");
		this.setInfo("Dient einem Professor als Arbeitsraum. Dadurch hat die Universitaet die Moeglichkeit, einen neuen Professor einzustellen. \nKostet: " + this.getCosts())

}

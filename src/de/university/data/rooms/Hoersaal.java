package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Hoersaal extends Room{
    //----constructor----
	
	public Hoersaal(){
		this.setName("Hoersaal");
		this.setCosts(6000);
		this.setSize(RoomSize.BIGGER);
		this.setKnowledgeBonus(15);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(500);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient dem Studenten zum Lernen. Erhoet die Wissenspunkte um " + this.getKnowledgeBonus() + ", die Wohlfühlpunkte um " + this.getWellbeingBonus()+ " und die Kapazitaet der Studenten der Universitaet um " + this.getStudentCapacity() + ".\nKostet: " + this.getCosts())

}

package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Seminarraum extends Room{
    //----constructor----
	
	public Seminarraum(){
		this.setName("Seminarraum");
		this.setCosts(1500);
		this.setSize(RoomSize.NORMAL);
		this.setKnowledgeBonus(10);
		this.setWellbeingBonus(10);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient dem Studenten zum Lernen. Erhoet die Wissenspunkte um " + this.getKnowledgeBonus() + " und die Wohlfühlpunkte um " this.getWellbeingBonus()  + ".\nKostet: " + this.getCosts())

}

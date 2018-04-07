package de.university.data.rooms;

import de.university.data.RoomSize;

public abstract class Lernraum extends Room{
    //----constructor----
	
	public Lernraum(){
		this.setName("Lernraum");
		this.setCosts(1000);
		this.setSize(RoomSize.SMALL);
		this.setKnowledgeBonus(5);
		this.setWellbeingBonus(5);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Dient dem Studenten zum Lernen. Erhoeht die Wissenspunkte um " + this.getKnowledgeBonus() + " und die Wohlfühlpunkte um " + this.getWellbeingBonus()  + ".\nKostet: " + this.getCosts())

}

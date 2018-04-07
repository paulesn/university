package de.university.data.rooms;

import de.university.data.RoomSize;

public class ParkingSpot extends Room{
    //----constructor----
	
	public ParkingSpot(){
		this.setName("Parking spot);
		this.setCosts(8000);
		this.setSize(RoomSize.GIGANTIC);
		this.setKnowledgeBonus(0);
		this.setWellbeingBonus(30);
		this.setStudentCapacity(0);
		this.setProfCapacity(0);
		this.setBenefits("");
		this.setInfo("Parking spots for students. Increases the points for wellbeing by " + this.getWellbeingBonus()  + ".\nCosts: " + this.getCosts());
	}
}

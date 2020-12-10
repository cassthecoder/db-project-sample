package com.cassandramatos.week6;

public class dFrancisHunt {

	private int streetId;
	private String streetName; 

	public dFrancisHunt(int streetId, String streetName) {
		this.setStreetId(streetId);
		this.setStreetName(streetName); 
	}

	public int getStreetId() {
		return streetId;
	}

	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}

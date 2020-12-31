package com.ensim.TP5.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Geometry implements Serializable{
	private String type;
	ArrayList<Float> coordinates;

	// Getter Methods

	

	public String getType() {
		return type;
	}

	// Setter Methods

	

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Float> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(ArrayList<Float> coordinates) {
		this.coordinates = coordinates;
	}
}



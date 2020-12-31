package com.ensim.TP5.model;

import java.util.ArrayList;

public class Meteo {
	 Object CoordObject;
	 ArrayList < Object > weather = new ArrayList < Object > ();
	 private String base;
	 Object MainObject;
	 private float visibility;
	 Object WindObject;
	 Object RainObject;
	 Object CloudsObject;
	 private float dt;
	 Object SysObject;
	 private float timezone;
	 private float id;
	 private String name;
	 private float cod;
	public ArrayList<Object> getWeather() {
		return weather;
	}
	public void setWeather(ArrayList<Object> weather) {
		this.weather = weather;
	}
	 
	 
	 
}

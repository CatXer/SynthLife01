package com.synthLife.World.areas;

public abstract class Area {
	
	private int temperature;
	private int wet_Level;
	private int light_level;
	private int toxic_level;
	private int oxigen_level;
	private int organic_level;
	private int mineral_level;
	
	
	
	public void setTemp(int value) {
		temperature = value;
	}
	public void setWet(int value) {
		wet_Level = value;
	}
	public void setLight(int value) {
		light_level = value;
	}
	public void setToxic(int value) {
		toxic_level = value;
	}
	public void setOxigen(int value) {
		oxigen_level = value;
	}
	public void setOrganic(int value) {
		organic_level = value;
	}
	public void setMinerals(int value) {
		mineral_level = value;
	}
	
	
	public int getTemp() {
		return temperature;
	}
	
	
}

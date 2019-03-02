package com.synthLife.World;

import java.util.HashMap;

import com.synthLife.World.areas.*;

public class WorldThread {

	private HashMap<String,Area> areas;
	
	public WorldThread(){
		areas = new HashMap<>();
		areas.put("ocean", new Ocean());
		areas.get("ocean").getTemp();
	}
	public void update() {
		
	}
	
}

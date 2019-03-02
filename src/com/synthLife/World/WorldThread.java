package com.synthLife.World;

import java.util.HashMap;

import com.synthLife.Engine.Starter;
import com.synthLife.World.areas.Ocean;

public class WorldThread extends Thread {

	private HashMap<String,Area> areas;
	
	public WorldThread(){
		areas = new HashMap<>();
		areas.put("ocean", new Ocean());
	}
	
	
	
	@Override
	public void run() {
		while(Starter.engine.isRunning()) {
			
		}
	}
	
}

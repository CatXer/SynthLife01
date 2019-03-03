package com.synthLife.World;

import java.awt.Graphics;
import java.util.ArrayList;

import com.synthLife.Engine.Engine;

public class World {

	
	private ArrayList<Field> map;
	
	public World(){
		initMap();
	}
	
	private void initMap() {
		map = new ArrayList<>();
		for(int x = 0; x < Engine.WIDTH; x+= Engine.Qal) {
			for(int y = 0; y < Engine.HEIGHT; y+= Engine.Qal)
			map.add(new Field(x, y, Engine.Qal-1));
		}
	}
	
	public void update() {
		
	}
	
	public void draw(Graphics g) {
		for(Field f : map)
			f.drawIt(g);
	}
	
}

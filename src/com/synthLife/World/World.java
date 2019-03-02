package com.synthLife.World;

import java.awt.Graphics;
import java.util.ArrayList;

public class World {

	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;
	public static final int Qal = 40;
	
	private ArrayList<Field> map;
	
	public World(){
		initMap();
	}
	
	private void initMap() {
		map = new ArrayList<>();
		for(int x = 0; x < WIDTH; x+=Qal) {
			for(int y = 0; y < HEIGHT; y+=Qal)
			map.add(new Field(x, y, Qal-1));
		}
	}
	
	public void update() {
		
	}
	
	public void draw(Graphics g) {
		for(Field f : map)
			f.drawIt(g);
	}
	
}

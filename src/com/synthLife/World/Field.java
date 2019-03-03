package com.synthLife.World;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import com.synthLife.Engine.Drawable;

public class Field implements Drawable {

	
	private int temp_level;
	private int light_level;
	private int wet_level;
	private int oxigen_level;
	private int toxic_level;
	private int organic_level;
	private int mineral_level;

	
	private int x;
	private int y;
	private int scale;
	private Color color;
	private Random r;
	
	
	
	public Field(int x, int y, int scale) {
		this.x = x;
		this.y = y;
		this.scale = scale;
		this.color = Color.BLUE;
		r = new Random();
	}

	@Override
	public void drawIt(Graphics g) {
		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		g.fillRect(x, y, scale, scale);
	}

	public int getTemp_level() {
		return temp_level;
	}

	public void setTemp_level(int temp_level) {
		this.temp_level = temp_level;
	}

	public int getLight_level() {
		return light_level;
	}

	public void setLight_level(int light_level) {
		this.light_level = light_level;
	}

	public int getWet_level() {
		return wet_level;
	}

	public void setWet_level(int wet_level) {
		this.wet_level = wet_level;
	}

	public int getOxigen_level() {
		return oxigen_level;
	}

	public void setOxigen_level(int oxigen_level) {
		this.oxigen_level = oxigen_level;
	}

	public int getToxic_level() {
		return toxic_level;
	}

	public void setToxic_level(int toxic_level) {
		this.toxic_level = toxic_level;
	}

	public int getOrganic_level() {
		return organic_level;
	}

	public void setOrganic_level(int organic_level) {
		this.organic_level = organic_level;
	}

	public int getMineral_level() {
		return mineral_level;
	}

	public void setMineral_level(int mineral_level) {
		this.mineral_level = mineral_level;
	}
	
	
	

}

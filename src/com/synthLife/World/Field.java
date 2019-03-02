package com.synthLife.World;

import java.awt.Color;
import java.awt.Graphics;

import com.synthLife.Engine.Drawable;

public class Field implements Drawable {

	
	private int x;
	private int y;
	private int scale;
	private Color color;
	
	
	
	public Field(int x, int y, int scale) {
		this.x = x;
		this.y = y;
		this.scale = scale;
		this.color = Color.BLUE;
	}

	@Override
	public void drawIt(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, scale, scale);
	}

}

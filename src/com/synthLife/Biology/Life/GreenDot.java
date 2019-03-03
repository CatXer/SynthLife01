package com.synthLife.Biology.Life;

import java.awt.Graphics;

import com.synthLife.Biology.Genetic.Genome;
import com.synthLife.Engine.Drawable;

public class GreenDot extends Organism implements Drawable {

	
	public Genome genome;

	public GreenDot(int x, int y, Genome baseG) {
		genome = baseG;
		setX(x);
		setY(y);
		
	}
	
	
	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void split() {
		GreenDot newO =new GreenDot(0,0,genome.mutate());
	}

	@Override
	public void drawIt(Graphics g) {
		g.setColor(genome.getColorBody());
		g.fillOval(getX(), getY(), 1, 1);		
	}

}

package com.synthLife.Biology.Life;


public abstract class Organism {
	
	private int x;
	private int y;	
	
	
	protected abstract void eat();
	
	protected abstract void move();

	protected abstract void split();


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

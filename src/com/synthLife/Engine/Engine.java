package com.synthLife.Engine;

import java.awt.Graphics;
import com.synthLife.World.World;

public final class Engine {

	private static PaintTool paintTool;
	private boolean isRunning;
	private boolean isClosed;
	private long timeMillis;
	private World world;
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;
	public static final int Qal = 10;


	
	
	protected Engine(){
		init();
		run();
	}
	
	private void init() {
		paintTool = new PaintTool("Genetic algorithm 0.1",WIDTH,HEIGHT);
		world = new World();
		
		timeMillis = 0;
		isClosed = false;
		isRunning = true;
	}
	
	//TIME THREAD NEXT -->//
	private void run() {
		while(!isClosed) {
	
			while(!isRunning) {
				try {
					//Pause//
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			world.update();
			drawSceen();	
			timeMillis++;
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void drawSceen() {
		Graphics g = paintTool.getGraphics();
		world.draw(g);
	}
	
	public boolean isRunning() {
		return isRunning;
	}
}

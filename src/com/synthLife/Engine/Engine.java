package com.synthLife.Engine;

import java.util.ArrayList;

public final class Engine {

	private static PaintTool paintTool;
	private boolean isRunning;
	private boolean isClosed;
	private long timeMillis;
	protected Engine(){
		init();
		run();
	}
	
	private void init() {
		paintTool = new PaintTool("Genetic algorithm 0.1",900,600);
		paintTool.draw(null);
	
		
		timeMillis = 0;
		isClosed = false;
		isRunning = true;
	}
	
	
	private void run() {
		while(!isClosed) {
	
			while(!isRunning) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			
			updateGraphics();
			
			timeMillis++;
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void updateGraphics() {
		ArrayList<Drawable> drawables = null;		
		
		
		paintTool.draw(drawables);
	}
}

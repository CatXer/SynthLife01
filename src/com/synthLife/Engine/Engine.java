package com.synthLife.Engine;

public final class Engine {

	protected static PaintTool paintTool; 
	
	protected Engine(){
		init();
	}
	
	private void init() {
		paintTool = new PaintTool("Genetic algorithm 0.1",900,600);
		paintTool.update();
	}
	
}

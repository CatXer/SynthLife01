package com.synthLife.Engine;

public class Starter {
	
	public static Engine engine;
	
	public static void main(String[] args) {
		StartEngine();
	}
	
	private static void StartEngine() {
		engine = new Engine();
	}

}

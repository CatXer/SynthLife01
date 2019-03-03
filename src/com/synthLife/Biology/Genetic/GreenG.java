package com.synthLife.Biology.Genetic;

import java.awt.Color;

public class GreenG extends Genome {

	@Override
	public Color getColorBody() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genome mutate() {
		Genome newGenome = null;
		try {
			newGenome = (Genome)this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newGenome;
	}

	
	
	
}

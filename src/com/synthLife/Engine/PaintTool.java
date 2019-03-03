package com.synthLife.Engine;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PaintTool extends JFrame{

	
	private PaintPanel paintPanel;
	
	protected PaintTool(String title, int width, int height){
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
		paintPanel = new PaintPanel(); 
		add(paintPanel);
		setVisible(true);
		
		
	}
	
	protected PaintPanel getPaintPanel() {
		return paintPanel;
	}
	
	
	
	private class PaintPanel extends JPanel{
		PaintPanel(){
			//setBackground(Color.blue);
		}
	}
}

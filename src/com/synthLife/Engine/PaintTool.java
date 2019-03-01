package com.synthLife.Engine;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
	
	protected void update() {
		paintPanel.repaint();
	}
	
	class PaintPanel extends JPanel{
		PaintPanel(){
			setBackground(Color.blue);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.black);
			g.drawRect(0,0,100,100);
		}
	}

}

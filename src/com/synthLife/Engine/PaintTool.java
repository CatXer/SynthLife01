package com.synthLife.Engine;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PaintTool extends JFrame{

	
	private ArrayList<Drawable> drawables;
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
	
	protected void draw(ArrayList<Drawable> drawables) {
		this.drawables = drawables;
		paintPanel.repaint();
	}
	
	
	
	private class PaintPanel extends JPanel{
		PaintPanel(){
			setBackground(Color.blue);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			for(Drawable d:drawables) {
				d.drawIt(g);
			}
		}
	}

}

package com.gitui.mainui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainPanel extends JPanel implements MouseListener{
	
	int width;
	int height;
	Color backgroundcolor = Color.WHITE;
	
	public MainPanel(int width, int height){
		this.width = width;
		this.height = height;
		addMouseListener(this);
		
	}
	
	public void organizePanel(){
		this.setLayout(new BorderLayout());
		
		JScrollPane panelScroller = new JScrollPane(this);
		panelScroller.setPreferredSize(new Dimension(this.width/2, this.height/2));
		
		this.setBackground(backgroundcolor);
		
		
		
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

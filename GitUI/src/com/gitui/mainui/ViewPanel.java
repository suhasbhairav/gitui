package com.gitui.mainui;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class ViewPanel{

	JFrame mainFrame;
	String programName = "GitUI";
	MainPanel mainPanel;
	int width;
	int height;
	
	
	public ViewPanel(){
		
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void showUI(){
		mainFrame = new JFrame(programName);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent window){
				System.exit(0);
			}
		});
		
		
		this.setHeight(800);
		this.setWidth(800);		
		mainFrame.setSize(new Dimension(this.getWidth(), this.getHeight()));
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		mainPanel = new MainPanel(600,600);
		mainPanel.organizePanel();
		
		JComponent contentPane = mainPanel;
		contentPane.setOpaque(true);
		
		mainFrame.setContentPane(contentPane);
		
		mainFrame.pack();
		mainFrame.setVisible(true);
		
	}
}

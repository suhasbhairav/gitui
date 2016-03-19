package com.gitui.showui;

import com.gitui.mainui.ViewPanel;

public class GitDisplay {

	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				(new ViewPanel()).showUI(); 
			}
		});

	}

}

package csse;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow extends JFrame{
	// attribute 
	private int width ;
	private int height ;
	// Constructor
	MyWindow(int w, int h){
		
		// attribute
		width = w ; 
		height = h ;
		
		
		// Basic setup 
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		
		
	}
}

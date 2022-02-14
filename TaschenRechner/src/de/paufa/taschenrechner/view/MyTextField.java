package de.paufa.taschenrechner.view;

import javax.swing.JTextField;

public class MyTextField extends JTextField{

	private final static MyTextField INSTANCE = new MyTextField();
	
	public static MyTextField getInstance() {
		return INSTANCE;
	}
	
	private MyTextField() {
		
	}
	
}

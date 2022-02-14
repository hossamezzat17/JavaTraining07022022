package de.paufa.taschenrechner.view;

import javax.swing.JButton;

import de.paufa.taschenrechner.control.MyActionListener;

public class MyButton extends JButton {

	public MyButton() {
		this("");
	}

	public MyButton(String text) {
		super(text);
		this.setFont(this.getFont().deriveFont(36.0F));
		this.addActionListener(MyActionListener.getInstance());
	}

}

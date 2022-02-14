package de.paufa.taschenrechner.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.paufa.taschenrechner.view.MyTextField;

public class MyActionListener implements ActionListener {

	private static final MyActionListener INSTANCE = new MyActionListener();

	public static MyActionListener getInstance() {
		return INSTANCE;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		MyTextField mtf = MyTextField.getInstance();
		
		
		/**
		 * Aufgabe: Die Zeichen sollen angehangen werden
		 * 
		 * Nun soll gerechnet werden.
		 */
		String tmp = MyTextField.getInstance().getText().concat(e.getActionCommand());
		MyTextField.getInstance().setText(tmp);
		
//		mtf.setText(e.getActionCommand());
		
		if(e.getActionCommand().equalsIgnoreCase("c")) {
			mtf.setText("");
		}
		
		if(e.getActionCommand().endsWith("=")) {
			
		}
		
	}

	private MyActionListener() {
		System.out.println("MyActionListener Objekt erzeugt");
	}

}

package de.paufa.taschenrechner.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel{

	public MainPanel() {
		this.setLayout(new BorderLayout(5,5));
		
		/**
		 * Anzeige der Zahlen - BEGINN
		 */
		JPanel displayPanel = new DisplayPanel();
		/**
		 * Anzeige der Zahlen - ENDE
		 */
		
		/**
		 * Erstellen der Buttons - BEGINN
		 * 
		 * % CE C / 7 8 9 * 4 5 6 - 1 2 3 + +/- 0 , =
		 */
//		String text = "% CE C / 7 8 9 * 4 5 6 - 1 2 3 + +/- 0 , =";
//		JPanel buttonsPanel = new ButtonPanel(text);

		/**
		 * ButtonPanel mit Builder Pattern
		 */
		ButtonPanel.Builder builder = new ButtonPanel.Builder();
		//builder.withGrid(0, 5);
		builder.withButton("a","b","c","d","e");
		builder.withButton("f","g","h","i","j");
		builder.withButton("k","l","m","n","o");
		builder.withButton("p","q","r","s","t","u");
		JPanel buttonsPanel = builder.build();

		/**
		 * Erstellen der Buttons - ENDE
		 */

		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonsPanel, BorderLayout.CENTER);
	}
	
}

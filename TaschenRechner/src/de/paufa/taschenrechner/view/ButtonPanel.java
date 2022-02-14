package de.paufa.taschenrechner.view;

import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	public ButtonPanel() {
		this("% CE C / 7 8 9 * 4 5 6 - 1 2 3 + +/- 0 , =");
	}

	/**
	 * 
	 * @param text      Die Texte welche auf den Buttons erscheinen sollen.
	 * @param delimiter Optional delimiter für den Text - Standard delimiter ist " "
	 *                  Leerzeichen
	 */
	public ButtonPanel(String text, String... delimiter) {
		/**
		 * Erstellen der Buttons - BEGINN
		 * 
		 * % CE C / 7 8 9 * 4 5 6 - 1 2 3 + +/- 0 , =
		 * 
		 * %;CE;C;/;7;8:9:*;4;5;6;-;1;2;3;+;+/-;0;,;=
		 */
		this.setLayout(new GridLayout(5, 4, 3, 3));
		this.setBackground(SystemColor.GREEN);
		
		//"% CE C / 7 8 9 * 4 5 6 - 1 2 3 + +/- 0 , ="
		//"%;CE;C;/;7;8:9:*;4;5;6;-;1;2;3;+;+/-;0;,;="
		//"%-CE-C-/-7-8-9-*-4-5-6---1-2-3-+-+/--0-,-="
		
//		String[] buttons = null;
//		if(delimiter.length==0) {
//			buttons = text.split(" ");
//		} else {
//			buttons = text.split(delimiter[0]);
//		}

		String[] buttons = text.split(delimiter.length<0 ? delimiter[0] : " ");
				
		for (String caption : buttons) {
			this.add(new MyButton(caption));
		}
		
//		Stream.of(text.split(" "))
//			  .map(s ->{return new MyButton(s);})
//			  .peek(b-> b.addActionListener((e)->System.out.println(e.getActionCommand())))
//			  .forEach(b-> this.add(b));
		
//		for(Component c: this.getComponents()) {
//			if(c instanceof MyButton button) {
//				button.addActionListener((e)->System.out.println(e.getActionCommand()));
//			}
//		}

		/**
		 * Erstellen der Buttons - ENDE
		 */
	}

}

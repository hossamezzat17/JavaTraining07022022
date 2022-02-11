package aufgaben.ml;

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

		String[] buttons = text.split(delimiter.length > 0 ? delimiter[0] : " ");

		for (String caption : buttons) {
			this.add(new MyButton(caption));
		}

		/**
		 * Erstellen der Buttons - ENDE
		 */
	}

}

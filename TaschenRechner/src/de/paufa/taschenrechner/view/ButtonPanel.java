package de.paufa.taschenrechner.view;

import java.awt.GridLayout;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	public static class Builder {

		private GridLayout gl;
		private List<JButton> buttons;

		public GridLayout getGl() {
			if (this.gl == null) {
				if (this.buttons.size() % 4 == 0) {
					gl = new GridLayout(0, 4);
				} else if (this.buttons.size() % 5 == 0) {
					gl = new GridLayout(0, 5);
				} else {
					gl = new GridLayout(0, 3);
				}
			}
			return gl;
		}

		private void setGl(GridLayout gl) {
			this.gl = gl;
		}

		public List<JButton> getButtons() {
			return buttons;
		}

		private void setButtons(List<JButton> buttons) {
			this.buttons = buttons;
		}

		public Builder() {
			buttons = new ArrayList<>();
		}

		public void withGrid(int rows, int columns) {
			this.gl = new GridLayout(rows, columns);
		}

		public void withButton(String... actionCommands) {
			for (String text : actionCommands) {
				buttons.add(new JButton(text));
			}
		}

		public ButtonPanel build() {
			return new ButtonPanel(this);
		}
	}

	private ButtonPanel(Builder builder) {
		this.setLayout(builder.getGl());
		for (JButton btn : builder.getButtons()) {
			this.add(btn);
		}
	}

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

		// "% CE C / 7 8 9 * 4 5 6 - 1 2 3 + +/- 0 , ="
		// "%;CE;C;/;7;8:9:*;4;5;6;-;1;2;3;+;+/-;0;,;="
		// "%-CE-C-/-7-8-9-*-4-5-6---1-2-3-+-+/--0-,-="

//		String[] buttons = null;
//		if(delimiter.length==0) {
//			buttons = text.split(" ");
//		} else {
//			buttons = text.split(delimiter[0]);
//		}

		String[] buttons = text.split(delimiter.length < 0 ? delimiter[0] : " ");

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

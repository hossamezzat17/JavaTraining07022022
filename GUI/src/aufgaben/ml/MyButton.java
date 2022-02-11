package aufgaben.ml;

import javax.swing.JButton;

public class MyButton extends JButton {

	public MyButton() {
		this("");
	}

	public MyButton(String text) {
		super(text);
		this.setFont(this.getFont().deriveFont(36.0F));
	}

}

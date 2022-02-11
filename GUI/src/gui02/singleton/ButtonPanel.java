package gui02.singleton;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	public ButtonPanel(JLabel label) {
		this.setLayout(new FlowLayout());
		JButton btn = new MyButton("Änder Text", label);
		this.add(btn);
	}

}

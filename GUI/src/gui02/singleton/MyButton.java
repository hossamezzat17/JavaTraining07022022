package gui02.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MyButton extends JButton implements ActionListener{

	private JLabel label;
	
	public MyButton() {
		
	}

	public MyButton(String text, JLabel label) {
		super(text);
		this.label = label;
		MyLabel.getInstance();
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText(label.getText() + e.getActionCommand());
		MyLabel.getInstance().setText("SingleTonPattern");
	}
}

package gui02.singleton;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NavigationPanel extends JPanel{

	private JLabel label;

	public JLabel getLabel() {
		return label;
	}

	private void setLabel(JLabel label) {
		this.label = label;
	}
	
	public NavigationPanel() {
		this.setLayout(new FlowLayout());
		label = new JLabel("Hallo Welt");
		this.add(label);
		this.add(MyLabel.getInstance());
	}
	
}

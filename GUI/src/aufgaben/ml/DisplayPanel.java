package aufgaben.ml;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisplayPanel extends JPanel{

	
	public DisplayPanel() {
		this.setLayout(new GridLayout(1,0,12,12));
		this.setPreferredSize(new Dimension(415, 85));
		
		JTextField display = new JTextField("0123456789 +-*/");
		display.setFont(display.getFont().deriveFont(36.0F));
		this.add(display);
	}
	
}

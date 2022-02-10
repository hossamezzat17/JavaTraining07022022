package gui.frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExampleFrame extends JFrame {

	public ExampleFrame() {
		this.setTitle("Hello World");
		this.setBounds(50, 50, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel content = new JPanel();
		content.setBackground(Color.ORANGE);
		this.add(content);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ExampleFrame();
	}
	
}

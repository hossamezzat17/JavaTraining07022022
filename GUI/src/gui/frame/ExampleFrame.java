package gui.frame;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExampleFrame extends JFrame {

	public ExampleFrame() {
		this.setTitle("Hello World");
		this.setBounds(50, 50, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel content = new JPanel();
		/**
		 * null - Absolut Layout
		 * 
		 * FlowLayout - Flieﬂend
		 * 
		 * GridLayout - Raster
		 * 
		 * GridBagLayout - Raster mit Taschenbildung
		 * 
		 * BorderLayout - Himmelsrichtungen und Center als bereiche
		 */
		content.setLayout(new FlowLayout(FlowLayout.LEADING,12,12));
		content.setBackground(Color.ORANGE);
		
		content.add(new JLabel("Hallo Welt"));
		content.add(new JButton("Hallo Welt"));
		content.add(new JLabel("Hallo Welt"));
		content.add(new JButton("Hallo Welt"));
		content.add(new JLabel("Hallo Welt"));
		content.add(new JButton("Hallo Welt"));
		
		
		
		this.add(content);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ExampleFrame();
	}
	
}

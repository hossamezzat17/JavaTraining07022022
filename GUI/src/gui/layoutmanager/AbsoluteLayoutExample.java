package gui.layoutmanager;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * AbsoluteLayout übersieht "preferred Size".
 * 
 * AbsoluteLayout übersieht "minimum Size"
 * 
 * AbsoluteLayout übersieht "maximum Size"
 * 
 * LayoutManager werden immer zu einen JPanel angegeben.
 * 
 * Hat keine Konstruktoren
 * 
 * AbsoluteLayout wird auch als NullLayout bezeichnet, das dem Panel kein
 * LayoutManager übergeben, steht dieser auf "null".
 * 
 */
public class AbsoluteLayoutExample extends JFrame {

	public AbsoluteLayoutExample() {
		JPanel contentPnl = new JPanel(null);
		this.setContentPane(contentPnl);



		for (int i = 0; i < 12; i++) {
			JButton tmp = new JButton("" + i);
			tmp.setBounds(10,((i*4)*10),120,35);
			contentPnl.add(tmp);
		}


		this.setTitle("Absolute Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new AbsoluteLayoutExample();
	}
}

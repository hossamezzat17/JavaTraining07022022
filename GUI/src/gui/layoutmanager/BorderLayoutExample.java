package gui.layoutmanager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * BorderLayout beachtet/ignoriert "preferred Size".
 * 
 * BorderLayout beachtet/ignoriert "minimum Size"
 * 
 * BorderLayout beachtet/ignoriert "maximum Size"
 * 
 * BorderLayout beachtet/ignoriert "Size"
 * 
 * LayoutManager werden immer zu einen JPanel angegeben.
 * 
 * BorderLayout()
 * 
 * BorderLayout(hgap, vgap)
 * 
 * Contraints
 * 
 * North, East, South, West, Center
 * 
 * PageStart, PageEnd, LineStart, LineEnd , Center
 * 
 */
public class BorderLayoutExample extends JFrame {

	public BorderLayoutExample() {
		JPanel contentPnl = new JPanel(new BorderLayout());
		this.setContentPane(contentPnl);

		JButton btnNorth = new JButton("North");
		contentPnl.add(btnNorth, BorderLayout.NORTH);
		
		JButton btnEast = new JButton("East");
		contentPnl.add(btnEast, BorderLayout.EAST);
		
		JButton btnSouth = new JButton("South");
		contentPnl.add(btnSouth, BorderLayout.SOUTH);
		
		JButton btnWest = new JButton("West");
		contentPnl.add(btnWest, BorderLayout.WEST);
		
		JButton btnCenter = new JButton("Center");
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnCenter);
		pnlCenter.setLayout(new FlowLayout());
		contentPnl.add(pnlCenter, BorderLayout.CENTER);
		
		this.setTitle("BorderLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutExample();
	}
}

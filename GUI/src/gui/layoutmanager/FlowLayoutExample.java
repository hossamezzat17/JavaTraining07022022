package gui.layoutmanager;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * FlowLayout beachtet "preferred Size".
 * 
 * FlowLayout ignoriert "minimum Size"
 * 
 * FlowLayout ignoriert "maximum Size"
 * 
 * LayoutManager werden immer zu einen JPanel angegeben.
 * 
 * 
 * FlowLayout() - Center , 5 , 5
 * 
 * FlowLayout(align) - x , 5 , 5 
 * 
 * FlowLayout(align, hgap, vgap)
 */
public class FlowLayoutExample extends JFrame {

	public FlowLayoutExample() {
		JPanel contentPnl = new JPanel(new FlowLayout());
		this.setContentPane(contentPnl);
		
		Dimension dim = new Dimension(100, 35);
		
		for(int i=0;i<12;i++) {
			JButton tmp = new JButton("" + i);
			tmp.setPreferredSize(dim);
//			tmp.setSize(dim);
//			tmp.setMinimumSize(dim);
			tmp.setMaximumSize(dim);
			contentPnl.add(tmp);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 400, 400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutExample();
	}
}

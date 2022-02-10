package gui.layoutmanager;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * GridLayout übersieht "preferred Size".
 * 
 * GridLayout ignoriert "minimum Size"
 * 
 * GridLayout ignoriert "maximum Size"
 * 
 * LayoutManager werden immer zu einen JPanel angegeben.
 * 
 * row, columns , hgap, vgap
 * 
 * GridLayout() - 1,0,0,0
 * 
 * GridLayout(row,columns) - x , y , 0 ,0 
 * 
 * GridLayout(row,columns, hgap, vgap)
 */
public class GridLayoutExample extends JFrame {

	public GridLayoutExample() {
		JPanel contentPnl = new JPanel(new GridLayout(5,5,12,12));
		this.setContentPane(contentPnl);
		
		Dimension dim = new Dimension(100, 35);
		
		for(int i=0;i<3;i++) {
			JButton tmp = new JButton("" + i);
			tmp.setPreferredSize(dim);
//			tmp.setSize(dim);
//			tmp.setMinimumSize(dim);
			tmp.setMaximumSize(dim);
			contentPnl.add(tmp);
		}
		
		this.setTitle("GridLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 400, 400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutExample();
	}
}

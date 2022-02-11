package aufgaben.ml;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

	public MainFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0,0,415,620);
		
		JPanel mainContent = new MainPanel();
		this.setContentPane(mainContent);
		
		this.setVisible(true);
	}
	
}

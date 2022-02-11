package gui02.singleton;

import javax.swing.JLabel;

public class MyLabel extends JLabel{

	private static final MyLabel INSTANCE = new MyLabel(); 
	
	public static MyLabel getInstance() {
		return INSTANCE;
	}
	
	private MyLabel() {
		super();
		this.setFont(this.getFont().deriveFont(72.0F));
	}
}

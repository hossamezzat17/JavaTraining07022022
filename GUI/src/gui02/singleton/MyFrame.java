package gui02.singleton;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	public static void main(String[] args) {
		new MyFrame();
	}

	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 640, 480);

		JPanel contentPanel = new JPanel(new BorderLayout());
		this.setContentPane(contentPanel);

		NavigationPanel navigationPnl = new NavigationPanel();
		contentPanel.add(navigationPnl, BorderLayout.NORTH);

		JPanel buttonPnl = new ButtonPanel(navigationPnl.getLabel());
		contentPanel.add(buttonPnl, BorderLayout.CENTER);

		this.setVisible(true);
	}

}

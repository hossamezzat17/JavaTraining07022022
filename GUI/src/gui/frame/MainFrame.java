package gui.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public MainFrame() {
		/**
		 * @JFrame.DO_NOTHING_ON_CLOSE Standard - bedeutet der Frame unternimmt nichts
		 *                             wenn er geschlossen wird.
		 * 
		 * @JFrame.DISPOSE_ON_CLOSE Wenn mehr als ein Frame erzeugt wird und beendet
		 *                          werden, beendet sich das Programm erst wenn der
		 *                          letzte Frame geschlossen wurde
		 * 
		 * @JFrame.EXIT_ON_CLOSE Das Programm wird mit dem Schliessen des Frames beendet
		 * 
		 * @JFrame.HIDE_ON_CLOSE Der Frame wird unsichtbar geschaltet.
		 * 
		 */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**
		 * Festlegen der Größe und Position des Frames
		 */
		Dimension dimVGA = new Dimension(640, 480);
		Rectangle rectDim = new Rectangle(dimVGA);

		Point point01 = new Point(100, 100);
		Rectangle rectPoint = new Rectangle(point01);

		Rectangle rectDimPoint = new Rectangle(point01, dimVGA);

		Rectangle rectAbsolute = new Rectangle(100, 100, 640, 480);

//		this.setBounds(rectDim);
//		this.setBounds(rectPoint);
//		this.setBounds(rectDimPoint);
//		this.setBounds(rectAbsolute);
		this.setBounds(200, 125,1100,540);

		
		this.setTitle("GUI example");
		
		JPanel mainPanel = new JPanel();
		//new GridLayout(row, columns, hgap, vgap)
		mainPanel.setLayout(new GridLayout(1, 0, 12, 12) );
		mainPanel.setBackground(Color.GREEN);
		this.setContentPane(mainPanel);
		/**
		 * Geht, ist aber nicht 'richtig'/'sauber'
		 */
		//this.add(mainPanel);
		
		
		JPanel innerPanel01 = new JPanel();
		innerPanel01.setBackground(Color.BLUE);
		this.getContentPane().add(innerPanel01);
		//mainPanel.add(innerPanel01);
		
		JPanel innerPanel02 = new JPanel();
		innerPanel02.setBackground(Color.MAGENTA);
		this.getContentPane().add(innerPanel02);
		//mainPanel.add(innerPanel02);
		
		/**
		 * Wird benötigt um den Frame anzeigen zu lassen
		 */
		this.setVisible(true);
	}
	
}

package gui.frome;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;

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

		/**
		 * Wird benötigt um den Frame anzeigen zu lassen
		 */
		this.setVisible(true);
	}
	
}

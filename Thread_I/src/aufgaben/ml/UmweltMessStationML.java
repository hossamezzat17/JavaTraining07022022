package aufgaben.ml;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Messung von Feinstaubwerten:
 * 
 * In einem Thread werden alle 100 Millisekunden Feinstaubwerte gemessen.
 * 
 * Simuliert wird jede Messung durch das Generieren einer Zufallszahl, die im
 * Bereich des vorherigen Wertes +/- 8 Mikrogramm liegt. Die Anfangswert kann
 * auf 15 Mikrogramm gesetzt werden.
 * 
 * 
 * In einem anderen Thread werden die drei letzten vorhandenen Messungen
 * analysiert (1 mal pro Sekunde). Falls in diesen drei Messungen der stätige
 * Abfall erkannt wird, wird die Tendenz auf der Konsole visualisiert. Dasselbe
 * zur stätigen Steigung.
 * 
 * 
 * Im dritten Thread werden Mitteilungen ausgegeben, falls die aktuelle
 * Feinstaubkonzentration einen Grenzwert überschreitet (>50) (Erhöhte
 * Belastung) oder unterschreitet (<8)(Sehr saubere Luft). Auch die Kontrollen
 * werden nur periodisch (1 Mal in 2 Sek) durchgeführt
 * 
 *
 */
public class UmweltMessStationML {

	private static Random rand;
	
	private static List<Integer> values;
	
	public static void main(String[] args) {
		rand = new Random();
		values = new ArrayList<>();
		
		Runnable targetMessungen = new Runnable() {
			@Override
			public void run() {
				generateRandom();
			}
		};
//		Referenz zum Runnable Object mitgeben
		Thread t1 = new Thread(targetMessungen,"Messungen"); 
		
//		Lambda erste Ausprägung
//		Thread t1 = new Thread(()->generateRandom(),"Messungen"); 
		
//		Lambda als Methodenreferenzen
//		Thread t1 = new Thread(UmweltMessStationML::generateRandom,"Messungen");
		
		t1.start();
	}

	/**
	 * In einem Thread werden alle 100 Millisekunden Feinstaubwerte gemessen.
	 * 
	 * Simuliert wird jede Messung durch das Generieren einer Zufallszahl, die im
	 * Bereich des vorherigen Wertes +/- 8 Mikrogramm liegt. Die Anfangswert kann
	 * auf 15 Mikrogramm gesetzt werden.
	 */
	private static void generateRandom() {
		int initial = 15;
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			initial = getMeasurement(initial);
			/**
			 * Die werte direkt in die Liste eintragen.
			 */
			values.add(initial);
			
			System.out.println("Messung : " + initial);
		}
	}

	private static int getMeasurement(int initial) {
		int random = rand.nextInt(9);//0 - 8
		if(rand.nextBoolean()) {
			// Plus
			initial += random;
		} else {
			// Minus
			initial -= random;
		}
		return initial < 0 ? 0 : initial;
		
		//int random = initial + (rand.nextInt(17) - 8);//0-16 minus 8 erg -> -8 bis +8
		//return random < 0 ? 0 : random;//verhindern von Negativen Zahlen
	}

	
	
	
	
	
	
	
	
	
	
}

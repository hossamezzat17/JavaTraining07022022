package komposition;

import java.util.List;

public class Applikation {

	public static void main(String[] args) {
		Lebewesen l = new Lebewesen();

		l.addBein(45);
		l.addBein(60);
		l.addBein(90);
		
		l.zeigeBeine();
		
		System.out.println(l.getBein());
		System.out.println(l.getBein());
		
		List<Bein> beine = l.getBeine();
		
		for (Bein bein : beine) {
			System.out.println(bein);
		}
	}

}

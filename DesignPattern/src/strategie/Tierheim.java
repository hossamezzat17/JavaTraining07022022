package strategie;

import java.util.ArrayList;
import java.util.List;

public class Tierheim {

	private static List<Hund> alleHunde = new ArrayList<>();

	public static void main(String[] args) {
		fillList();
		
		for (Hund h : alleHunde) {
			System.out.println(h.getClass().getSimpleName());
			h.bellen();
			h.laufen();
			System.out.println("------------------------");
		}
		
	}

	private static void fillList() {
		alleHunde.add(new Boxer());
		alleHunde.add(new BullDogge());
		alleHunde.add(new Chihuahua());
		alleHunde.add(new WestHighlandTerrier());
		Boxer b = new Boxer();
		b.setBellVerhalten(new LeisesBellen());
		alleHunde.add(b);
		alleHunde.add(new BullDogge());
		alleHunde.add(new Chihuahua());
		alleHunde.add(new WestHighlandTerrier());

	}

}

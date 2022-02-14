package strukturierte;

public class StrukturierteProgrammierung {

	static class Schwein {
		String name;
		int alter;
		int gewicht;
	}

	public static void main(String[] args) {
		Schwein s01 = new Schwein();
		s01.name = "Fredderick";
		s01.alter = 4;
		s01.gewicht = 165;
		
		Schwein s02 = new Schwein();
		s02.name = "Piggeldy";
		s02.alter = 9;
		s02.gewicht = 235;

		/**
		 * Schwein soll Essen und damit zunehmen
		 */
		schweinFuettern(s01, 26);
		schweinFuettern(s02, 15);
		schweinInfo(s01);
		schweinInfo(s02);
		
	}

	public static void schweinFuettern(Schwein schwein, int menge) {
		schweinWiegen(schwein);
		System.out.println("Schwein futtert");
		schwein.gewicht = schwein.gewicht + menge;
		schweinWiegen(schwein);
	}

	public static void schweinWiegen(Schwein schwein) {
		System.out.println("Schwein gewicht :\n\t" + schwein.gewicht);
	}
	
	public static void schweinInfo(Schwein schwein) {
		System.out.println("Das Schwein heiﬂt " + schwein.name);
		System.out.println("Das Schwein ist  " + schwein.alter + " jahre alt.");
		schweinWiegen(schwein);
	}
}

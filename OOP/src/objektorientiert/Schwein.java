package objektorientiert;

public class Schwein {

	private String name;
	private int alter;
	private int gewicht;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equalsIgnoreCase("babe")) {
			this.name = "Rudy";
		} else {
			this.name = name;
		}
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public Schwein() {
		this("Standard Schwein", 1, 10);
	}

	public Schwein(String name, int alter, int gewicht) {
		this.setName(name);
		this.setAlter(alter);
		this.setGewicht(gewicht);
	}

	public String toString() {
		return this.getClass().getSimpleName() + " : " + this.getName() + " : " + this.getAlter() + " : "
				+ this.getGewicht();
	}
	
	public void futtern(int menge) {
		System.out.println(this.getName() + " futtert");
		this.setGewicht(this.getGewicht() + menge);
	}
	
	
	public void futtern(Gemuese gemuese,int menge) {
		System.out.println(this.getName() + " futtert " + gemuese.getName());
		this.setGewicht(this.getGewicht()+menge);
		gemuese.wirdgefressen(menge);
	}
	
//	public void futtern(Kartoffel kartoffel) {
//		System.out.println(this.getName() + " futtert " + kartoffel.getName());
//		this.setGewicht(this.getGewicht() + kartoffel.getKnollen());
//		kartoffel.wirdgefressen();
//	}
//	
//	public void futtern(Moehre moehre) {
//		System.out.println(this.getName() + " futtert " + moehre.getName());
//		this.setGewicht(this.getGewicht() + moehre.getLaenge());
//		moehre.wirdgefressen();
//	}
//	
//	public void futtern(Zuckerruebe zuckli) {
//		System.out.println(this.getName() + " futtert " + zuckli.getName());
//		this.setGewicht(this.getGewicht() + zuckli.getGewicht());
//		//zuckli.wirdgefressen();
//	}

}

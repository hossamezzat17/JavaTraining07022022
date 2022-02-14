package objektorientiert;

public class Moehre {

	private String name;
	private int laenge;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLaenge() {
		return laenge;
	}

	private void setLaenge(int laenge) {
		this.laenge = laenge;
	}
	
	public Moehre() {
		this("Leckerschmeck",18);
	}
	
	public Moehre(String name, int laenge) {
		this.setName(name);
		this.setLaenge(laenge);
	}

	@Override
	public String toString() {
		return "Moehre [getName()=" + getName() + ", getLaenge()=" + getLaenge() + "]";
	}
	
	public void wirdgefressen() {
		this.setLaenge(0);
	}
}

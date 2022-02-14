package objektorientiert;

public class Kartoffel {

	private String name;
	private int knollen;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKnollen() {
		return knollen;
	}

	private void setKnollen(int knollen) {
		this.knollen = knollen;
	}

	public Kartoffel() {
		this("Sonja", 25);
	}

	public Kartoffel(String name, int knollen) {
		this.setName(name);
		this.setKnollen(knollen);
	}

	@Override
	public String toString() {
		return "Kartoffel [getName()=" + getName() + ", getKnollen()=" + getKnollen() + "]";
	}

	public void wirdgefressen() {
		this.setKnollen(0);
	}
}

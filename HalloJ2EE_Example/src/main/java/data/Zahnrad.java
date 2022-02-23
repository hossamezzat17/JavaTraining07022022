package data;

public class Zahnrad {
	private int zaehne;

	public int getZaehne() {
		return zaehne;
	}

	public void setZaehne(int zaehne) {
		this.zaehne = zaehne;
	}

	public Zahnrad() {
		this(3);
	}

	public Zahnrad(int zaehne) {
		this.setZaehne(zaehne);
	}

	@Override
	public String toString() {
		return "Zahnrad [getZaehne()=" + getZaehne() + "]";
	}
	
	
}

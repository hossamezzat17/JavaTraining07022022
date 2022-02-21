package komposition;

public class Bein {

	private int laenge;
	
	public Bein() {
		
	}
	
	public Bein(Bein origin) {
		this.laenge = origin.laenge;
	}
	
	public Bein(int laenge) {
		this.laenge = laenge;
	}

	public Bein copy() {
		Bein copy = new Bein();
		copy.laenge = this.laenge;
		return copy;
	}
}

package strategie;

public class Chihuahua extends Hund {

	public Chihuahua() {
		this.setBellVerhalten(new Klaeffen());
		this.setLaufVerhalten(new SchnellLaufen());
	}
	
}

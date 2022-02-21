package strategie;

public class Boxer extends Hund {

	public Boxer() {
		this.setBellVerhalten(new LautBellen());
		this.setLaufVerhalten(new SchnellLaufen());
	}
	
}

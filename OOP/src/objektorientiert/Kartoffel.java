package objektorientiert;

public class Kartoffel extends AGemuese {

	public Kartoffel() {
		this("Sonja", 25);
	}

	public Kartoffel(String name, int knollen) {
		super(name,knollen);

	}
	
	
	public void diesKannNurKartoffel() {}

}

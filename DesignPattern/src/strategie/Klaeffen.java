package strategie;

public class Klaeffen implements BellVerhalten{

	@Override
	public void bellen() {
		System.out.println(this.getClass().getSimpleName() + ": Klaeff Klaeff  Klaeff  nervig");
	}

}

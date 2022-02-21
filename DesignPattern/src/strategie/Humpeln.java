package strategie;

public class Humpeln implements LaufVerhalten {

	@Override
	public void laufen() {
		System.out.println(this.getClass().getSimpleName() + ": humpelndes Laufen");
	}

}

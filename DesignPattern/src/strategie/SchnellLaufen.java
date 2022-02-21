package strategie;

public class SchnellLaufen implements LaufVerhalten {

	@Override
	public void laufen() {
		System.out.println(this.getClass().getSimpleName() + ": schnelles Laufen");
	}

}

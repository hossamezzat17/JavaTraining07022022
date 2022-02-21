package strategie;

public class NormalLaufen implements LaufVerhalten {

	@Override
	public void laufen() {
		System.out.println(this.getClass().getSimpleName() + ": normales Laufen");
	}

}

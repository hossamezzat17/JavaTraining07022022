package strategie;

public class KannNichtLaufen implements LaufVerhalten {

	@Override
	public void laufen() {
		System.out.println(this.getClass().getSimpleName() + ": bewegt sich nicht");
	}

}

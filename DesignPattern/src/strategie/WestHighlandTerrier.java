package strategie;

public class WestHighlandTerrier extends Hund {

	public WestHighlandTerrier() {
		this.setLaufVerhalten(new KannNichtLaufen());
	}
	
}

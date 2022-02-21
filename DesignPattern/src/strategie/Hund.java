package strategie;

public abstract class Hund {

	/**
	 * Standardverhalten von Hund festlegen
	 */
	private BellVerhalten bellVerhalten = new Knurren();
	private LaufVerhalten laufVerhalten = new NormalLaufen();

	public BellVerhalten getBellVerhalten() {
		return bellVerhalten;
	}

	public void setBellVerhalten(BellVerhalten bellVerhalten) {
		this.bellVerhalten = bellVerhalten;
	}

	public LaufVerhalten getLaufVerhalten() {
		return laufVerhalten;
	}

	public void setLaufVerhalten(LaufVerhalten laufVerhalten) {
		this.laufVerhalten = laufVerhalten;
	}

	public void bellen() {
		this.getBellVerhalten().bellen();
	}

	public void laufen() {
		this.getLaufVerhalten().laufen();
	}
}

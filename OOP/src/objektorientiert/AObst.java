package objektorientiert;

public abstract class AObst extends APflanze {

	private String name;
	private int menge;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public AObst() {
		this("AObst",0);
	}

	public AObst(String name,int menge) {
		this.setName(name);
		this.setMenge(menge);
	}

	public void wirdgefressen(int menge) {
		if (this.getMenge() < menge) {
			this.setMenge(0);
		} else {
			this.setMenge(this.getMenge() - menge);
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [getName()=" + getName() + ", getMenge()=" + getMenge() + "]";
	}

	@Override
	public void wachsen() {
		this.setMenge(this.getMenge() + 1);

	}

}

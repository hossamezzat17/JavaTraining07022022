package objektorientiert;

public abstract class Gemuese {

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

	public Gemuese() {
		this("A Gemuese",0);
	}

	public Gemuese(String name,int menge) {
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
		return this.getClass().getSimpleName() +  " [getName()=" + getName() + ", getMenge()=" + getMenge() + "]";
	}
	
	
}

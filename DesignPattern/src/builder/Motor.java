package builder;

public enum Motor {
	SMALLBLOCK(1.1, 48), MEDIUMBLOCK(1.8, 84), BIGBLOCK(4.8, 245);

	private final double ccm;
	private final int kw;

	Motor(double ccm, int kw) {
		this.ccm = ccm;
		this.kw = kw;
	}

	@Override
	public String toString() {
		return name().toLowerCase() + " Hubraum : " + this.ccm + " KW : " + this.kw;
	}
}

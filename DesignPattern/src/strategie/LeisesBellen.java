package strategie;

public class LeisesBellen implements BellVerhalten{

	@Override
	public void bellen() {
		System.out.println(this.getClass().getSimpleName() + ": bell bell  bell  leise");
	}

}

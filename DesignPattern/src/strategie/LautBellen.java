package strategie;

public class LautBellen implements BellVerhalten{

	@Override
	public void bellen() {
		System.out.println(this.getClass().getSimpleName() + ": BELL BELL BELL Laut");
	}

}

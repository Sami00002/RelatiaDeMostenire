public class AvioaneDeCalatori extends Avioane {

	protected int maxNumberOfPassagers;

	public AvioaneDeCalatori(String planeID, int totalEnginePower, int maxNumberOfPassagers) {
		super(planeID, totalEnginePower);
		this.maxNumberOfPassagers = maxNumberOfPassagers;
	}

	public int getMaxNumberOfPassagers() {
		return maxNumberOfPassagers;
	}
}
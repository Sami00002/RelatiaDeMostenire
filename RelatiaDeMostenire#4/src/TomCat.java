
public class TomCat extends AvioaneDeLupta {

	public TomCat(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);

	}

	public void launchMissile() {
		System.out.println("PlaneID Value" + this.planeID
				+ " - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
	}

	public void refuel() {
		System.out.println(
				"PlaneID: " + this.planeID + "Initiating refueling procedure - Locating refueller - Catching up -"
						+ " Refueling - Refueling complete.");
	}
}
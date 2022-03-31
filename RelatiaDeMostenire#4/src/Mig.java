public class Mig extends AvioaneDeLupta {

	public Mig(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);

	}

	public void launchMissile() {
		System.out.println("PlaneID Value" + this.planeID
				+ " - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
	}

	public void highSpeedGeometry() {
		System.out.println("PlaneID: " + this.planeID + "High speed geometry selected");
	}

	public void normalGeometry() {
		System.out.println("PlaneID: " + this.planeID + "Normal geometry selected");
	}
}
public class AvioaneDeLupta extends Avioane {

	public AvioaneDeLupta(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}

	public void launchMissile() {
		System.out.println("PlaneID: " + this.planeID
				+ " Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
	}

}
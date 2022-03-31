
public class Main {

	public static void main(String[] args) {

		Avioane normalPlane = new Avioane("31", 2000);
		AvioaneDeCalatori comercial = new AvioaneDeCalatori("32", 1800, 300);
		Concorde CASH = new Concorde("33", 12000, 1050);
		Boeing BoeingPlane = new Boeing("34", 3200, 45);
		AvioaneDeLupta militaryPlane = new AvioaneDeLupta("35", 3500);
		Mig mig = new Mig("36", 6500);
		TomCat TC = new TomCat("37", 8500);
		TC.launchMissile();
		militaryPlane.launchMissile();
		System.out.println(normalPlane.getPlaneID());

	}

}

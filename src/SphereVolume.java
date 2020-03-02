
public class SphereVolume implements ISubscriber{
	public void notifySubscriber(String input) {
		Float Rad;
		double Result;
		Rad = Float.parseFloat(input);
		Result=(4/3)*(3.14)*(Rad*Rad*Rad);
		System.out.println("Sphere Volume =" + Result);
	}

}


abstract class bankk{
	
	abstract int getRateOfInterest();
}

class Axis extends bankk{
	
	int getRateOfInterest() {
		return 7;
	}
}

class Icici extends bankk{
	
	int getRateOfInterest() {
		return 6;
	}
}



public class Abstract {
	public static void main(String args[]) {
		Axis a = new Axis();
		Icici I = new Icici();
		int resultAxis = a.getRateOfInterest();
		int resultIcici = I.getRateOfInterest();
		System.out.println("rate of interest in Axis bank is "+resultAxis);
		System.out.println("rate of interest in Icici bank is "+resultIcici);
	}

}

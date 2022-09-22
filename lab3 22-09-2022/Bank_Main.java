
//Main method to create objects and call the methods.  
public class Bank_Main {

	public static void main(String[] args) {
		BOB s = new BOB();
		AXIS i = new AXIS();
		System.out.println("BOB Rate of Interest: " + s.getRateOfInterest() + "%");
		System.out.println("BOB provides " + s.accountOpening());
		System.out.println("AXIS Rate of Interest: " + i.getRateOfInterest() + "%");
		System.out.println("AXIS provides " + i.accountOpening());
	}
}

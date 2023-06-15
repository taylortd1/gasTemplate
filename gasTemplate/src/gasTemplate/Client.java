package gasTemplate;

public class Client {

	public static void main(String[] args) {
	CountryCorner cc1 = new CountryCorner(3.19, "Mid", 12, true);
	Speedway s1 = new Speedway(3.20, "Reg", 8, true);
	
	System.out.println("Country Corner tests...");
	cc1.pumpGas();
	System.out.println("\nCountry Corner tests...");
	cc1.pumpGas();
	System.out.println("\nCountry Corner tests...");
	cc1.pumpGas();
	System.out.println("\nCountry Corner tests...");
	cc1.pumpGas();
	System.out.println("\nCountry Corner tests...");
	cc1.pumpGas();
	
	System.out.println("\nSpeedway tests...");
	s1.pumpGas();
	System.out.println("\nSpeedway tests...");
	s1.pumpGas();
	System.out.println("\nSpeedway tests...");
	s1.pumpGas();
	System.out.println("\nSpeedway tests...");
	s1.pumpGas();
	System.out.println("\nSpeedway tests...");
	s1.pumpGas();
	
	}
}

package gasTemplate;

import java.util.Random;

public abstract class GasStation {

	protected double gasPrice;
	protected String gasType;
	protected int gallonsGas;
	protected boolean carWash;
	protected Random rnd = new Random();
	
	
	
	final void pumpGas() {
		
		intiatePurchase();
		
		if (validateCard() == true) {
			
		selectCarWash();
		selectGrade();
		liftHandle();
		fillUp();
		receipt();
		thankyou();
		}
		
		 
	}
	
	final void intiatePurchase() {
		
		System.out.println("insert card to intiate purchase...");
	}
	
	final boolean validateCard() {
		
		int val = rnd.nextInt(3);
		if (val == 1) {
			System.out.println("Card validation failed!");
			return false;
		}
		else System.out.println("Card Accepted..");
		return true;
		
	}
	
	abstract void selectCarWash();
	
	void selectGrade() {
		
		System.out.println("You have selected " + gasType + "..");
	}
	
	void liftHandle() {
		
		System.out.println("Please lift handle to begin pumping...");
	}
	
	void fillUp() {
		
		System.out.println("Filling up... You got " + gallonsGas + "gallons of gas..");
	}
	
	void receipt() {
		double total = (double) gallonsGas * gasPrice;
		System.out.println("Printing receipt... Your total is " + String.format("%.2f", total) + "$..");
	}
	
	void thankyou() {
		
		System.out.println("Thankyou for your buisness!");
	}
	
}

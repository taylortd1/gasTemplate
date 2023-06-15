package gasTemplate;

public class Speedway extends GasStation{
	
	public Speedway(double gasPrice, String gasType, int gallonsGas, boolean carWash) {
		this.gasPrice = gasPrice;
		this.gasType = gasType;
		this.gallonsGas = gallonsGas;
		this.carWash = carWash;
	}
	
	public void selectCarWash() {
		
		if (carWash == true) {
			
			System.out.println("Carwash selected!!!");
			
		}
		else System.out.println("No carwash today..");
	}
	
}

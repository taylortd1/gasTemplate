package gasTemplate;

public class CountryCorner extends GasStation{

	public CountryCorner(double gasPrice, String gasType, int gallonsGas, boolean carWash) {
		
		this.gasPrice = gasPrice;
		this.gasType = gasType;
		this.gallonsGas = gallonsGas;
		this.carWash = carWash;
	}
	
	public void selectCarWash() {
		
		System.out.println("We dont offer a carwash sorry for the inconvience..");
	}
}

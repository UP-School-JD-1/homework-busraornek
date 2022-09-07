package hmwrkBes;

public class ConsultancyProduct extends Product  {
	
	public ConsultancyProduct(String description, String sku, double price, double tax) {
		super(description, sku, price, tax);
	}
   
	@Override
	public void getProductPrice() {
		
		System.out.println("Our consultancy service fee is 400$");
	}

	@Override
	public double getPriceWithTax() {
		double newPrice3 = 400 + ((400 * 18) / 100 );
		
		return newPrice3;

	}

	@Override
	public void purchase() {
		double newPurchase = getPriceWithTax();
		System.out.println("The amount you have to pay:" + newPurchase);

	
	}
}

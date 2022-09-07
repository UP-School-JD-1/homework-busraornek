package hmwrkBes;

public class OldComputerSales implements Priceable, Locatable {
	
	protected double price;
	protected double tax;
	
	OldComputerSales(double price, double tax) {
		this.price = price;
		this.tax = tax;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public void getDepot() {
		String depo3="Bodrum";
		System.out.println("Warehouse to be delivered:"+ depo3);
		
	}

	@Override
	public void getPlace() {
		String place3="Muğla";
		System.out.println("Where the product will go:" + place3);
		
	}
	@Override
	public void getProductPrice() {
		
	}

	@Override
	public double getPriceWithTax() {
     
		double price5 = getPrice();
		
		System.out.println("Computer Price:" + price5);
		
		return price5;

	}

	@Override
	public void purchase() {
		double newPurchase = getPriceWithTax();
		System.out.println("The amount you have to pay:" + newPurchase);

	
	}
}

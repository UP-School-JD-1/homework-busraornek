package hmwrkBes;

import java.util.Date;

public class FoodProduct extends Product implements Locatable{ 

	protected Date productionDate;
	protected int life;
	
	public FoodProduct(String description, String sku, double price, double tax, Date productionDate, int life) {
		super(description ,sku , price, tax);
		this.productionDate = productionDate;
		this.life = life;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	@Override
	public void getDepot() {
		String depo1 = "Marmaris";
		System.out.println("Warehouse to be delivered:" + depo1);		
		
	}
	
	public void getPlace() {
		String place1 = "Muğla";
		System.out.println("Where the product will go:" + place1);
		
	}
	@Override
	public void getProductPrice() {
		
		System.out.println("The price of the " +super.sku + " you bought is " + super.getPrice());
	}

	@Override
	public double getPriceWithTax() {
		double newPrice = 2 + ((2 * 8) / 100 );
		
		return newPrice;

	}

	@Override
	public void purchase() {
		double newPurchase = getPriceWithTax();
		System.out.println("The amount you have to pay:" + newPurchase);

	
	}
}

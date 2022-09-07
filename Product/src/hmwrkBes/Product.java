package hmwrkBes;

public class Product extends BaseProduct implements Priceable  {
	
	private double price;
	
	private double tax;
	
	public Product(String description, String sku, double price, double tax) {
		super(sku , description);
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
	public void getProductPrice() {

	}

	@Override
	public double getPriceWithTax() {
		
		return tax;

	}

	@Override
	public void purchase() {

	
   
	}
}



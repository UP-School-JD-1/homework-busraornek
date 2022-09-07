package hmwrkBes;

public class ClothProduct extends Product implements Locatable{
	
	protected String sex;
	protected String size;
	
	public ClothProduct(String description, String sku, String sex, String size,double price,double tax) {
		super(description, sku ,price,tax);
		this.sex=sex;
		this.size=size;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public void getDepot() {
		String depot2="Bodrum";
		System.out.println("Warehouse to be delivered:"+depot2);
		
	}

	@Override
	public void getPlace() {
		String place2="Muğla";
		System.out.println("Where the product will go:"+place2);
		
	}
	@Override
	public void getProductPrice() {
		
		System.out.println("The price of the " +super.sku + "you bought is " + super.getPrice());
	}

	@Override
	public double getPriceWithTax() {
		double newPrice = 20 + ((20 * 20) / 100 );
		
		return newPrice;

	}

	@Override
	public void purchase() {
		double newPurchase = getPriceWithTax();
		System.out.println("The amount you have to pay:" + newPurchase);

	
	}
}

package hmwrkBes;

public class Gift extends BaseProduct implements Locatable {
	
	public Gift(String description, String sku) {
		super(description, sku);
	}
	
	@Override
	public void getDepot() {
		String depo3= "Şahinbey";
		System.out.println("Warehouse to be delivered:"+ depo3);
		
	}

	@Override
	public void getPlace() {
		String place3= "Gaziantep";
		System.out.println("Where the product will go:" + place3);
	}

  
}

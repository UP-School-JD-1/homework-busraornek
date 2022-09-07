package hmwrkBes;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
	    FoodProduct food = new FoodProduct("Food Product","Melon" , 45.45, 8 ,new Date(), 2);
		ClothProduct cloth = new ClothProduct("Cloth Product","T-shirt", "Woman", "XS", 180.0, 20.0);
		Gift gift1 = new Gift("Cloth Product", "T-shirt");
		ConsultancyProduct consultancy1 = new ConsultancyProduct("It", "Java", 400, 18);
		OldComputerSales sale1 = new OldComputerSales(5000, 20);
		
		food.purchase();
		food.getPriceWithTax();
		food.getProductPrice();
		food.getDepot();
	  
		System.out.println("**************************************");
		cloth.getProductPrice();
		cloth.getPriceWithTax();
		cloth.purchase();
		cloth.getPlace();
		System.out.println("**************************************");
		gift1.getDepot();
		gift1.getPlace();
		System.out.println("**************************************");
		
		consultancy1.getPriceWithTax();
		consultancy1.getProductPrice();
		consultancy1.purchase();
		
		System.out.println("**************************************");
		
		sale1.getPriceWithTax();
		sale1.getProductPrice();
		sale1.purchase();
		sale1.getDepot();
		sale1.getPlace();
	}
	

}

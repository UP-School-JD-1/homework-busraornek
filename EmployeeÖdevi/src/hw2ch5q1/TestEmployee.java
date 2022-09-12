package hw2ch5q1;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee( 134,"Büşra",13,"Engineer");
		e1.work();
		try {
			System.out.println("Amount to be paid: " + e1.calculateSalary());
		} 
		catch (SalaryPaidOnBankException e) {
			e.getMessage();
			durationSalaryPaidOnBankException(e);
	
		}
		

		System.out.println("*****************************************");

	   Manager m1 = new Manager( 18750, "Nida", 9 , "Engineer", "Engineer");
	   m1.work();
	  
	   try {
		  System.out.println("Amount to be paid:" + m1.calculateSalary());
	    } 
	   catch (SalaryPaidOnBankException e) {
		  e.getMessage();
		  durationSalaryPaidOnBankException(e);
	}
	   System.out.println("*****************************************");
	
	   Director d1 = new Director( 18750, "Nida", 9 , "Engineer", "Engineer",470.75);
	   d1.work();
	  
	  
	   try {
		System.out.println("Amount to be paid:" + d1.calculateSalary());
	} 
	   catch (SalaryPaidOnBankException e) {
		 e.getMessage();
		 durationSalaryPaidOnBankException(e);
	}

}

	private static void durationSalaryPaidOnBankException(SalaryPaidOnBankException e) {
		
		System.err.println(e.getMessage());
	}
}


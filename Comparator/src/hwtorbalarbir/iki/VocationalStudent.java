package hwtorbalarbir.iki;

import java.util.Date;

public class VocationalStudent extends AbstractStudent{
	
	public VocationalStudent (int no , String name ,String surname, int year , Date dob , String major) {
		
		super( no, name ,surname, year, dob , major);
		
		
	}
	@Override
	   public void study() {
		   
		   System.out.println("I am vocational study.");
		   
	   }
	@Override
	   public void register(){
		
		System.out.println("Fill in the information below to register.");
		System.out.println("Name: " +name  );
		System.out.println("Your year of birth:" + year);
		System.out.println("Your school number: " + no);
		System.out.println("Date of registration: " + dob);
		System.out.println("Which domain are you signing up for? "+ major);
		
			
		  
	   }
	@Override
	   public String toString () {
	    	return name ;
	    	
	    }

}

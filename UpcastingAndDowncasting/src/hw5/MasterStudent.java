package hw5;

import java.util.Date;

public class MasterStudent extends GraduateStudent{

	public MasterStudent (int no , String name , int year ,  Date dob ,String major, String advisor, String thesis) {
		
		super(no , name, year, dob, major, advisor, thesis );
		
		
	}
	
	@Override
	
	public void study() {
		   
		   System.out.println("I am master study.");
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
	 public void writethesis() {
			
			System.out.println("What are you planning to write a thesis about? " +thesis);
			
		}
	@Override
	 public void meetWithAdvisor() {
	    	
	    	System.out.println("Under whom will you write the thesis? " +advisor);
	    }
	 
}

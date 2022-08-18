package hw5;

import java.util.Date;

public class GraduateStudent extends Student{
	
	protected String advisor;
	protected String thesis;
	
	public GraduateStudent (int no , String name , int year , Date dob, String major, String advisor,String thesis) {
   
	super( no, name , year, dob, major);
	
	this.advisor = advisor;
	this.thesis = thesis;
	}
	
   @Override
   public void study() {
	   
	   System.out.println("I am graduate study.");
	   
   }
   @Override
   public void register(){
	   System.out.println("Fill in the information below to register.");
	   System.out.println("Name: " +name  );
	   System.out.println("Your year of birth:" + year);
	   System.out.println("Your school number: " + no);
	   System.out.println("Date of registration: " + dob);
	   System.out.println("Which domain are you signing up for? "+ major);
	   System.out.println("Who is your advisor? "+ advisor);
	   System.out.println("What are you going to write a thesis about? "+ thesis);
		
	
   }
	public void writethesis() {
		
		System.out.println("The name of our thesis: " +thesis);
		
	}
    public void meetWithAdvisor() {
    	
    	System.out.println("My advisor: " +advisor);
    }
}

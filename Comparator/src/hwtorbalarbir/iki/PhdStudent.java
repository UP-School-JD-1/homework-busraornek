package hwtorbalarbir.iki;

import java.util.Date;

public class PhdStudent extends GraduateStudent{
	
	protected boolean qualifyingExamTaken;
	
     public PhdStudent (int no, String name,String surname, int year ,Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no,name,surname,year, dob , major,advisor,thesis);
        this.qualifyingExamTaken=qualifyingExamTaken;
    }
     
   
     public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}


	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}


	@Override
 	
 	public void study() {
 		   
 		   System.out.println("I am phd study.");
 	}
     @Override
 	 public void register(){
    	   
 			
    	 System.out.println("Fill in the information below to register.");
  	     System.out.println("Name: " +name  );
  	     System.out.println("Your year of birth:" + year);
  	     System.out.println("Your school number: " + no);
  	     System.out.println("Date of registration: " + dob);

  	     
 		   
    	  
 	 }
     @Override
 	 public void writethesis() {
 			
 			System.out.println("What are you planning to write a thesis about? " +thesis);
 			
 		}
     @Override
 	 public void meetWithAdvisor() {
 	    	
 	    	System.out.println("Who is your advisor?  " +advisor);
 	    }
     public void writePaper() {
    	 
    	 if(qualifyingExamTaken == true) {
	    	System.out.println("You passed the exam");
    	 }
    	 else {
    		 System.out.println("Your proficiency test was not found!");
    		 
    	 }
     }
 	 
}

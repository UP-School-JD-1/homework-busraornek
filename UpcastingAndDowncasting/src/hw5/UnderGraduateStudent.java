package hw5;

import java.util.Date;

public class UnderGraduateStudent extends Student{

	protected String minor;
	

    public UnderGraduateStudent (int no , String name , int year ,Date dob , String major, String minor) {
  
		super( no, name , year, dob , major);
	
		this.minor = minor;
    }
    @Override
	   public void study() {
		   
		   System.out.println("I am under graduate study.");
		   
	   }
    @Override
	   public void register(){
			
		   System.out.println("Fill in the information below to register.");
		   System.out.println("Name: " +name  );
		   System.out.println("Your year of birth:" + year);
		   System.out.println("Your school number: " + no);
		   System.out.println("Your graduation date " + dob);
		   System.out.println("What major did you graduate from before? "+ minor);
		   System.out.println("Which domain are you signing up for? "+ major);
	   }
    @Override
	   public String toString () {
	    	return minor ;
	    	
	    }
}

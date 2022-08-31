package hw3;

import java.util.Date;




public class Test {
	

	public static void main(String[] args) {
		RegistrationOffice reo = new RegistrationOffice();
		

	
	GraduateStudent s2 = new GraduateStudent(5, "İsmail", 14,new Date(), "Production", "Production", "sfsdg");
	       
	        
    s2.register();
    reo.getAStudent(s2);
    reo.registerStudent(s2);
    System.out.println("*********************** ");
    
    MasterStudent s3 = new MasterStudent(5, "İsmail", 14,new Date(), "Math", "Math", "Ahmet");
   
    s3.register();
   reo.getAStudent(s3);
   reo.registerStudent(s3);
 		
   System.out.println("*********************** ");
     
   GraduateStudent student2 = new GraduateStudent(3535, "Ayşe", 1995, new Date(),"Math", "Math","Nesrin");
		if(student2 instanceof GraduateStudent){
			System.out.println(student2.name);
		}
		else {
			System.out.println("Student2 is not GraduateStudent! ");
		}
		
	 student2.study();
	 reo.getAStudent(student2);
	 reo.registerStudent(student2);
		 
	 System.out.println("*********************** ");
	
	
	 MasterStudent student1 = new MasterStudent(469575, "Pınar", 1994, new Date(),"Maht", "Maht","Burak");
	if(student1 instanceof MasterStudent){
		System.out.println(student1.name);
	}
	else {
		System.out.println("Student1 is not MasterStudent! ");
	}
	
 student1.study();
 reo.getAStudent(student1);
 reo.registerStudent(student1);
	 
 

	 
	
}
		
}
	




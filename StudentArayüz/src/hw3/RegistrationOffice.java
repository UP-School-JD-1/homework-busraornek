package hw3;

import java.util.Date;



public class RegistrationOffice {


	
		
		GraduateStudent getAStudent(GraduateStudent student) {
			String studentname = student.getName();
			System.out.println("Student's name: " + studentname);
			return student;
		   }
		UnderGraduateStudent getAStudentOne(UnderGraduateStudent student) {
			String studentname = student.getName();
			System.out.println("Student's name: " + studentname);
			return student;
		   }
		MasterStudent getAStudenTwo(MasterStudent student) {
			String studentname = student.getName();
			System.out.println("Student's name: " + studentname);
			return student;
		   
		}

			
			public void registerStudent(GraduateStudent student) {
				
				System.out.println("Student registration information: ");
				System.out.println("Student's name: " +student.getName());
				System.out.println("Student number: " + student.getNo());
				System.out.println("Student's branch: " +student.getMajor());
				System.out.println("Student's registration date: " +student.getDob());
				
				
	
	
	
	
	//public static void main(String[] args) {
		
		// Upcasting
		AbstractStudent  s1 = new UnderGraduateStudent(5, "İsmail", 14,new Date(), "Production", "Production");
				
	s1.study();
	
	AbstractStudent s2 = new GraduateStudent(5, "İsmail", 14,new Date(), "Production", "Production", "sfsdg");
	        
	        
    s2.study();
   
    System.out.println("*********************** ");
    
    AbstractStudent s3 = new MasterStudent(5, "İsmail", 14,new Date(), "Math", "Math", "Ahmet");
    
    
    s3.study();
   
 		
   System.out.println("*********************** ");
     //downcasting
     
   AbstractStudent student2 = new GraduateStudent(3535, "Ayşe", 1995, new Date(),"Math", "Math","Nesrin");
		if(student2 instanceof GraduateStudent){
			System.out.println(student2.name);
		}
		else {
			System.out.println("Student2 is not GraduateStudent! ");
		}
		
	 student2.study();
	 
		 
	 System.out.println("*********************** ");
	
	
	 AbstractStudent student1 = new MasterStudent(469575, "Pınar", 1994, new Date(),"Maht", "Maht","Burak");
	if(student1 instanceof MasterStudent){
		System.out.println(student1.name);
	}
	else {
		System.out.println("Student1 is not MasterStudent! ");
	}
	
 student1.study();
	
}
}
 
	
	
	
	
	
	


package hwtorbalarbir.iki;



import java.util.Collections;

import java.util.List;




public class Test {
	

	public static void main(String[] args) {
		
	
			  
			
		RegistrationOffice reo = new RegistrationOffice();

		
		List<AbstractStudent> student = reo.getStudentList();

		Collections.sort(student, new ComparatorStudent());

		for (AbstractStudent student4 : student) {
			System.out.println(student4);
		}
		

	
		
	}
	

		}

	
		
	

	
	

 

	 
	
	
		

	




package hwtorbalarbir;



import java.util.Collections;

import java.util.List;




public class Test {
	

	public static void main(String[] args) {
		
	
			  
			
		RegistrationOffice reo = new RegistrationOffice();

		
		List<AbstractStudent> student = reo.getStudentList();

		Collections.sort(student);

		printAbstractStudents(student);
		}

	private static void printAbstractStudents(List<AbstractStudent> student) {
		
		System.out.println("Student:");
		student.forEach(System.out::println);
		
	}

	

		}

	
		
	

	
	

 

	 
	
	
		

	




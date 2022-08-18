package hw5;


public class RegistrationOffice {

	public RegistrationOffice(){
	
	}
	
	
	Student getAStudent(Student student) {
	String studentname = student.getName();
	System.out.println("Student's name: " + studentname);
	return student;
   }
	
	public void registerStudent(Student student) {
		
		System.out.println("Student registration information: ");
		System.out.println("Student's name: " +student.getName());
		System.out.println("Student number: " + student.getNo());
		System.out.println("Student's branch: " +student.getMajor());
		System.out.println("Student's registration date: " +student.getDob());
		
		
	}
}

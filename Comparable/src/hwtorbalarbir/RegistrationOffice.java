package hwtorbalarbir;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

		}
		
		public static List<AbstractStudent> getStudentList() {
			
		  List<AbstractStudent> student3 = new ArrayList<AbstractStudent>();
		  
		  student3.add(new GraduateStudent(3535, "Ayşe","Zeynel", 1995, new Date(),"Math", "Math","Nesrin"));
		  student3.add(new MasterStudent(469575, "Pınar","ÖZ", 1994, new Date(),"Math", "Math","Burak"));
		  student3.add(new UnderGraduateStudent(57665, "İsmail","Kaşıkcı", 1993 ,new Date(), "Production", "Production"));
		  student3.add(new PhdStudent(2335, "Büşra","Zeynel", 1990, new Date(),"Math", "Math","Serkan", true));
		  student3.add(new VocationalStudent(45635, "Zeynep","Kale", 1995, new Date(),"Math"));
		  
		  return student3;
		}
		
  
}
 
	
	
	
	
	
	


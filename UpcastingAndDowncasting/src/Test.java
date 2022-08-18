
public class Test {
	

	public static void main(String[] args) {
	
		
		Student student = new Student (122, "Büşra Örnek" , 1998 , "Maths");
		UnderGraduateStudent underGraduateStudent = new UnderGraduateStudent(9876, "Serkan Uysal" ,191, "Economy" , "Software Engineer"  );
		VocationalStudent  vocationalStudent = new VocationalStudent(6798, "Nida Uysal" , 1998 , "Maths");
		GraduateStudent graduateStudent = new GraduateStudent(1245, "Ayşe Uysal" , 1995 , "Maths" , "Mustafa Burç", "Geometry of Riemannian manifolds with density" );
		MasterStudent masterStudent = new MasterStudent(14556, "Fatma Uysal" , 1990 , "Maths" , "Mustafa Burç", "On linear complementary pair of codes" );
		PhdStudent phdStudent = new PhdStudent(1245, "Zeynep Uysal" , 1985 , "Maths" , "Mustafa Burç", "Analysis of solutions of stochastic evolution equations" , true);
		
		
		
		
		
		
		student.register();
		student.study();
		student.toString();
		
		System.out.println("****************");
		
		underGraduateStudent.register();
		underGraduateStudent.study();
		underGraduateStudent.toString();
		
		System.out.println("***************");
		vocationalStudent.study();
		vocationalStudent.register();
		vocationalStudent.toString();
		
		System.out.println("***************");
		
		graduateStudent.study();
		graduateStudent.register();
		graduateStudent.meetWithAdvisor();
		graduateStudent.writethesis();
		
		System.out.println("***************");
		
		masterStudent.study();
		masterStudent.register();
		masterStudent.meetWithAdvisor();
		masterStudent.writethesis();
		
		System.out.println("***************");
		
		phdStudent.study();
		phdStudent.register();
		phdStudent.meetWithAdvisor();
		phdStudent.writethesis();
		phdStudent.writePaper();
		
		

	}


}

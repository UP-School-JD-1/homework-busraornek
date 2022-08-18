package hw5;

import java.util.Date;

public class Student {

	
	protected int no;
	protected String name;
	protected int year;
	protected Date dob;
	protected String major; 

	public Student(int no,String name , int year, Date dob , String major){
	
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
		
	}
	
    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int year() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public void study() {
		System.out.println("I am a study");
	}
	public void register() {
		System.out.println("Fill in the information below to register.");
		System.out.println("Name: " +name  );
		System.out.println("Your year of birth:" + year);
		System.out.println("Your school number: " + no);
		System.out.println("Date of registration: " + dob);
		System.out.println("Which domain are you signing up for? "+ major);
		
		
		
		
	}

    public String toString () {
    	return name ;
    	
    }
}

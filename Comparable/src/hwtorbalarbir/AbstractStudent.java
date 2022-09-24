package hwtorbalarbir;

import java.util.Date;

public abstract class AbstractStudent implements Student, Comparable{
	protected int no;
	protected String name;
	protected String surname;
	protected int year;
	protected Date dob;
	protected String major; 

	public AbstractStudent(int no,String name ,String surname, int year, Date dob , String major){
	
		this.no = no;
		this.name = name;
		this.surname = surname;
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
	public abstract void register() ;

    public String toString () {
    	return name ;
    	
    }
    @Override
	public int compareTo(Object o) {
		AbstractStudent student1 = (AbstractStudent) o;
		return name.compareTo(student1.surname);
	}

}

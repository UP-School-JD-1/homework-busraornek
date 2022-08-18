package reading.book;

public class Reader {
	String name;
	int age;
	char sex;
	
	public Reader(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
	}
	 public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public char getSex() {
	        return sex;
	    }

	    public void setSex(char sex) {
	        this.sex = sex;
	    }
	    public void getData() {
	        System.out.println("Reader Information : name = " + name + ", age = " + age + ", sex = " + sex);
	    }
	    void reader(Book read) {
	        if (read.currentPage == 0) 
	        	System.out.println(name + "has not started reading the " + read.title + " book.");
	        else if (read.currentPage == read.page)
	            System.out.println(name + " has finished the " + read.title + " book.");
	        else
	            System.out.println(name + " has read the " + read.currentPage + " page of the " + read.title + " book.");
	    }
	    
	
	
}

import java.util.Objects;

public class Square extends Shape{
	
	private int length ;

	public Square(int length) {
		
		super("Square");
		this.length = length;
	}
	@Override
    void draw() {
        System.out.println("Square is drawn.");
        
    }
	@Override
	void arase() {
		System.out.println("Delete the square!");
	}
	@Override
	 double calculateArea() {
		double area = length * length;
		 System.out.println("Area of ​​the square: " + area );
	        return area;
	    }
	@Override
	public double calculateCircumference() {
		double circumference = 4 * length;
		System.out.println("Circumference of the square " + circumference);
		return circumference;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(length);
	}
	@Override
	public String toString() {
		return "Square [length=" + length + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return length == other.length;
	}
    
}

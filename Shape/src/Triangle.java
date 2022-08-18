import java.util.Objects;

public class Triangle extends Shape {
	
	private int length1 ;
	private int length2 ;
	private int length3 ;
	private int height ;
	
public Triangle(int length1, int length2 , int length3 , int height) {
		
		super("Triangle");
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
		this.height = height;
		
	}
	@Override
    void draw() {
        System.out.println("Triangle is drawn.");
        
    }
	@Override
	void arase() {
		System.out.println("Delete the triangle!");
	}
	@Override
	 double calculateArea() {
		double area = (length1 * height)/2;
		 System.out.println("Area of ​​the trangle: " + area );
	        return area;
	    }
	@Override
	public double calculateCircumference() {
		double circumference = length1 + length2 + length3;
		System.out.println("Circumference of the triangle " + circumference);
		return circumference;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, length1, length2, length3);
	}
	@Override
	public String toString() {
		return "Triangle [length1=" + length1 + ", length2=" + length2 + ", length3=" + length3 + ", height=" + height + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return height == other.height && length1 == other.length1 && length2 == other.length2
				&& length3 == other.length3;
	}
	

}

import java.util.Objects;

public class Rectangle extends Shape {
	
	private int shortEdge ;
	private int longEdge ;
	
	public Rectangle(int shortEdge, int longEdge) {
		
		super("Rectangle");
		this.shortEdge =shortEdge ;
		this.longEdge = longEdge;

	}
	@Override
    void draw() {
        System.out.println("Rectangle is drawn.");
        
    }
	@Override
	void arase() {
		System.out.println("Delete the rectangle!");
	}
	@Override
	 double calculateArea() {
		double area = shortEdge * longEdge;
		 System.out.println("Area of ​​the rectangle: " + area );
	        return area;
	    }
	@Override
	public double calculateCircumference() {
		double circumference = 2 * (shortEdge + longEdge );
		System.out.println("Circumference of the rectangle: " + circumference);
		return circumference;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(longEdge, shortEdge);
	}
	@Override
	public String toString() {
		return "Rectangle [shortEdge=" + shortEdge + ", longEdge=" + longEdge + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return longEdge == other.longEdge && shortEdge == other.shortEdge;
	}
    
}

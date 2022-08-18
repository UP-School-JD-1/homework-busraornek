import java.util.Objects;

public class Circle extends Shape {
	
	private int radius ;
	
	public Circle(int radius) {
		super("Circle");
		this.radius=radius;
	}
	
	@Override
    void draw() {
        System.out.println("Circle is drawn..");
    }
	@Override
	
	void arase() {
		System.out.println("Delete the circle!");
	}
	@Override
	 double calculateArea() {
		double area = Math.PI * radius * radius;
		 System.out.println("Area of ​​the circle: " + area );
	        return area;
	    }
	

	@Override
	public double calculateCircumference() {
		double circumference = 2 * Math.PI *radius;
		System.out.println("Circumference of the circle " + circumference);
		return circumference;
		
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(radius);
		
	}
	@Override
	public String toString() {
		
		return "Circle [radius=" + radius + "]";
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}

	 
	 

}

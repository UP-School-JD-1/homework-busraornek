
public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle(5);
		Circle circle1 = new Circle(54);
		
		Rectangle rectangle = new Rectangle(8,6);
		Rectangle rectangle1 = new Rectangle(8,6);
		
		Square square = new Square(24);
		Square square1 = new Square(24);
		
		Triangle triangle = new Triangle(5, 7 , 8 , 7);
		Triangle triangle1 = new Triangle(5, 7 , 8 , 7);
		
		circle.draw();
		circle.calculateArea();
		circle.arase();
		System.out.println("HashCode:  " + circle.hashCode() );
		System.out.println("HashCode1:  " + circle1.hashCode() );
		System.out.println(circle.toString());
		System.out.println(circle1.toString());
		System.out.println("Are circle and circle1 equal? -"+ circle.equals(circle1));
		
		System.out.println("*****");
		
		rectangle.draw();
		rectangle.calculateArea();
		rectangle.arase();
		System.out.println("HashCode: " + rectangle.hashCode() );
		System.out.println("HashCode1: " + rectangle1.hashCode() );
		System.out.println(rectangle.toString());
		System.out.println(rectangle1.toString());
		System.out.println("Are rectangle and rectangle1 equal? -"+ rectangle.equals(rectangle1));
		
		System.out.println("*****");
		
		square.draw();
		square.calculateArea();
		square.arase();
		System.out.println("HashCode: " +square.hashCode() );
		System.out.println("HashCode1: " +square1.hashCode() );
		System.out.println(square.toString());
		System.out.println(square.toString());
		System.out.println("Are square and square1 equal? -"+ square.equals(square1));
		
		
		System.out.println("*****");
		
		triangle.draw();
		triangle.calculateArea();
		triangle.arase();
		System.out.println("HashCode: " +triangle.hashCode() );
		System.out.println("HashCode1: " +triangle1.hashCode() );
		System.out.println(triangle.toString());
		System.out.println(triangle.toString());
		System.out.println("Are triangle and triangle1 equal? -"+ triangle.equals(triangle1));
		
		
		
		System.out.println("*****");
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}

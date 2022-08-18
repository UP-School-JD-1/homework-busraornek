
public class Shape {

	    protected String name;

		public Shape(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		void draw() {
			System.out.println("Draw a " + name );
		}
		void arase() {
			System.out.println("Delete the shape!");
		}
	
		 double calculateArea() {
			 System.out.println("Calculating the area of ​​the " + name);
		        return 0.0;
		    }
		 public double calculateCircumference() {
			 System.out.println("Calculating the area of ​​the " + name);
			 
			 return 0.0;
			}
	}



  public class Point {
	  
	private double x ;
	private double y ;
	
	
	//this
	 
	 public Point(double x1, double y1) {
	 this.x = x1;
	 this.y = y1;
  }
    // public Point(double x1) {
    //	 this( x1 , 0 );
    	 
     //}
     //public Point(double y1) {
    	// this(0 , y1 );
     //}
     //get-set
     public double getX() {
    	 return this.x;
    	 
     }
     public void setX(double x1){
    	 x = x1;
     }
     public double getY() {
    	 return this.y;
     } 

     public void setY(double y1){
    	 y = y1;
     }
     //methods
     public double distanceFromTheOrigin() {
    	 double a = (this.x * this.x) + (this.y * this.y);
 		return Math.sqrt(a);
     }
     public double distanceFromThePoint(double j, double w) {
    	 double b = Math.pow((j - this.x), 2);
 		double c = Math.pow((w - this.y), 2);
 		return Math.sqrt(b + c);
     }
     public Point clone(double x , double y) {
    	 return new Point(x,y);
     }
     public void move(double z, double t ) {
    	 this.x = this.x + z;
    	 this.y = this.y + t;
    	 
     }
     }
  
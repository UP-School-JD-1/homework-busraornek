
public class RightTriangle {

	public static void main(String[] args) {
		drawRenctangle(7);
		
	}
    public static void drawRenctangle(int height) {
	
    	for(int row = 0; row < height; row++) {
    		for(int i = 0; i< row + 1; i++) {
    			System.out.print("*");
    		}
            System.out.println();
    	}
    	
    }
    
    
}

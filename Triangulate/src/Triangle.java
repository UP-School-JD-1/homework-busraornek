
public class Triangle {

	public static void main(String[] args) {
		drawRectangle(7);
		drawRectangle2(10);

	}
	
	public static void drawRectangle(int height) {
		for(int row = 0; row < height; row++) {
			for(int k = 0; k < (height - row); k++) {
				System.out.print(" ");
			
			}
		
			for(int j = 0; j < 2 * row + 1 ; j++) {
				System.out.print("*");
			}
			for(int k = 0; k < (height - row); k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	public static void drawRectangle2(int height) {
		for(int row = 0; row < height; row++) {
			for(int k = 0; k <= 2 * height - 1; k++) {
				int m = ((2*height -1) - (2*row + 1))/2;
				if((k <= m) | (k >  m + (2*row + 1)) )
				System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			}
			
		}
		
	}


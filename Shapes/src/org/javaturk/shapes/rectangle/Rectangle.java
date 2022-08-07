package org.javaturk.shapes.rectangle;

public class Rectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		//r.drawFilledFakeRectangle1();
        //r.drawFilledRectangle (10 , 5);
		r.drawVoidRectangle (10 , 5);
		//r.drawVoidFakeRectangle();
		
	}
    public void drawFilledFakeRectangle1 () {
    	System.out.println("********");
    	System.out.println("********");
    	System.out.println("********");
    	System.out.println("********");
    	System.out.println("********");
    	System.out.println("********");
    	System.out.println("********");
    	System.out.println("********");
    	System.out.println("********");
    	System.out.println("********");
    	
    	
    }
    public void drawFilledRectangle(int row , int column) {
    	for (int i = 0; i < row; i++) {
    		for (int j = 0; j < column; j++) {
    		     System.out.print("*");
    		     if(j == column - 1 )
    		    	 System.out.println();
    		}
    		}
    }
    public void drawVoidRectangle(int row , int column) {
    	for (int i = 0; i < row; i++) {
    		for (int j = 0; j < column; j++) {
    		   if(i== 0 | i == row - 1  ) {
    			  System.out.print("*");
    		   if(j == column - 1 )
    			   System.out.println();
    		   }
    		   else {
    			   if(j == 0)
    				   System.out.print("*");
    			   else if(j == column - 1)
    				   System.out.println("*");
    			   else
    				   System.out.print(" ");
    		   
    		   }
    		}
    		}
    	}
    	
    		     
    		 
    public void drawVoidFakeRectangle () {
    	System.out.println("********");
    	System.out.println("*      *");
    	System.out.println("*      *");
    	System.out.println("*      *");
    	System.out.println("*      *");
    	System.out.println("*      *");
    	System.out.println("*      *");
    	System.out.println("*      *");
    	System.out.println("*      *");
    	System.out.println("********");
    }
}

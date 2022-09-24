package hwfonsiyonelbir;

import java.util.function.IntConsumer;

public class EvenNumberOperationsWithLambda {
	
	private static int total;
	private static int product = 1;
	private static int[] squares = new int[7];

	public static void main(String[] args) {
		IntConsumer printer = (i) -> System.out.print(i + " ");
		
		doEvenNumberOperationWithLambdaOperation(printer, 14);
		
		
		System.out.println();
		
		IntConsumer rally = i -> total += i;
		
		doEvenNumberOperationWithLambdaOperation(rally, 14);
		
		System.out.println("Sum: " + total);

        IntConsumer multi = i -> product *= i;
		
		doEvenNumberOperationWithLambdaOperation(multi, 15);
		
		System.out.println("Product: " + product);
		
		
        IntConsumer square = i -> squares[i / 2 - 1] = i * i ;
		
		doEvenNumberOperationWithLambdaOperation(square, 14);
		
		System.out.println("Squares: " );
		
		for(int i : squares)
			
			printer.accept(i);

	
	}

	public static void doEvenNumberOperationWithLambdaOperation(IntConsumer operation, int n) {
		for (int i = 2; i <= n; i += 2) 
			operation.accept(i);
	}

}

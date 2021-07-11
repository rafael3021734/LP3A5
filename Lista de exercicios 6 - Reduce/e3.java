package Exercicio6.Entregas;

import java.util.stream.IntStream;

public class e3 {

	public static void main(String[] args) {
		
		 int f = factorial(5);

		    System.out.println(f);

		  }
		  
		  public static int factorial(final int n) {
		    return IntStream.rangeClosed(1, n).reduce((x, y) -> x * y).getAsInt();
		  }
		
}

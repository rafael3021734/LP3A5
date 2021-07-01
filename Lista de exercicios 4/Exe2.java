package Exercicios4;

import java.util.Arrays;
import java.util.List;

public class Exe2 {

	public static void main(String[] args) {


		List<Integer> lista = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
//		Filtro mantendo apenas os n�meros pares
		
		System.out.println("Filtro mantendo apenas os n�meros pares");
			lista.stream()				
			    .filter(f -> f % 2 == 0)				
				.forEach(e -> System.out.print(e));

			System.out.println();
	
//	   Ignores os dois primeiros n�meros
			System.out.println("Ignores os dois primeiros n�meros");
			lista.stream()
			    .skip(2)							   
				.forEach(e -> System.out.print(e));
			
			System.out.println();
			
//	  Limite o processamento aos dois primeiros n�meros
			System.out.println("Limite o processamento aos dois primeiros n�meros");
			lista.stream()
			    .limit(2)								
				.forEach(e -> System.out.print(e));
			
			System.out.println();
			
//	Aplique uma multiplica��o por 2 em cada elemento 
			System.out.println("Aplique uma multiplica��o por 2 em cada elemento");
			lista.stream()			    
				.map(e -> e *2)				
				.forEach(e -> System.out.print(e));
		
		System.out.println();
	
//	Mostre o resultado final 
			System.out.println("Mostre o resultado final");
			lista.stream()
			    .filter(f -> f % 2 == 0)
			    .skip(2)
			    .limit(2)
			    .map(e -> e *2)			    
				.forEach(e -> System.out.print(e));
			
			System.out.println();	
	}
	

}

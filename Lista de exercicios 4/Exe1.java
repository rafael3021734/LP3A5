package Exercicios4;

import java.util.Arrays;
import java.util.List;

public class Exe1 {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
	//	Mostre todos os n�meros sem repeti��o
		lista.stream()			
			.forEach(e -> System.out.print(e));
		
		System.out.println();
		
	//Mostre todos os n�meros �mpares sem repeti��o
				
		lista.stream()		
		.filter(f -> f % 2 == 1)		
		.forEach(f -> System.out.print(f));
		
		System.out.println();		
		
		lista.stream()		
		.filter(f -> f % 2 == 0)		
		.forEach(f -> System.out.print(f));
		
		//Mostre todos os n�meros a partir do 5 algarismo sem repeti��o
		
		System.out.println();
		
		lista.stream()		
		.skip(5)		
		.forEach(f -> System.out.print(f));
		
		//Mostre todos os n�meros multiplicados por 4
		System.out.println();
		
		lista.stream()		
		.map(e -> e *4)		
		.forEach(f -> System.out.print(f));		
	}

}

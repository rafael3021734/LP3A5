package Exercicios4;

import java.util.Arrays;
import java.util.List;

public class Exe4 {

	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList(" Paulo ", " Camila ", " Ana Maria ", " Patrick ", " Ana Clara ", " Pedro ", " Alfredo ");
		
		
		System.out.println("Lista de nomes");
			lista.stream()				
			  //  .filter(f -> f % 2 == 0)		
			  //  .map(charAt(e -> String.valueOf(array[0].charAt(0))))	
				.forEach(e -> System.out.print(e));

	}

}

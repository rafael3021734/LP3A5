package Exercicio6.Entregas;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class e1 {

	public static void main(String[] args) {
		
		System.out.println("cem números aleatórios:");
		List<Integer> num = Stream.generate(()->new Random()
				.nextInt(100))
				.limit(10)
				.collect(Collectors.toList());
		
		System.out.println("Lista");
		System.out.println(num + "\n");
		
		List<Integer> list = num;
		Optional<Integer> soma = list.stream()
		.reduce((n1, n2) -> n1 + n2);
		
		
		System.out.println("soma: "+ soma.get());
		
		Optional<Integer> mult = list.stream()
				.reduce((n1, n2) -> n1 * n2);
		
		System.out.println("mult: "+ mult.get());	
		
		Optional<Integer> menorValor = list.stream()
				.reduce((d1, d2) -> Math.min(d1, d2));
		System.out.println("menor: " + menorValor);
		
		Optional<Integer> maiorValor = list.stream()
				.reduce((d1, d2) -> Math.max(d1, d2));
		System.out.println("menor: " + maiorValor);	
		
		
	}

}

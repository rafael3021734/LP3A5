package Exercicio6.Entregas;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class e2 {

	public static void main(String[] args) {
		List<String> names = Stream.of(
				"Paulo","Camila","Ana Maria","Patrick",
				"Ana Clara", "Pedro", "Alfredo")
				.collect(Collectors.toList());
		
		System.out.println("\nNomes com P:");
		names.stream().filter(name -> name.startsWith("P"))
		.forEach(System.out::println);
		
		Optional<String> concatenacao = names.stream()
				.filter(name -> name.startsWith("P"))
				.reduce((s1, s2) -> s1.concat(s2));		
				System.out.println("concatenação: " + concatenacao.get());
				
		
		List<String> names2 = Stream.of(
				"Paulo","Camila","Ana Maria","Patrick",
				"Ana Clara", "Pedro", "Alfredo")
				.collect(Collectors.toList());
												
		System.out.println("\nNomes com A:");
		names2.stream().filter(name2 -> name2.startsWith("A"))
		.forEach(System.out::println);

		Optional<String> concatenacao2 = names2.stream()
				.filter(name -> name.startsWith("A"))
				.reduce((s1, s2) -> s1.concat(s2));
				System.out.println("concatenação: " + concatenacao2.get());
	}

}

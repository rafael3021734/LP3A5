package br.com.streams.exercicio4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste {
	public static void main(String[] args) {
		List<String> names = Stream.of(
				"Paulo","Camila","Ana Maria","Patrick",
				"Ana Clara", "Pedro", "Alfredo")
				.collect(Collectors.toList());
		
		System.out.println("\nNomes com P:");
		names.stream().filter(name -> name.startsWith("P"))
		.forEach(System.out::println);
		
		System.out.println("\nNomes por Tamanho:");
		names.stream().sorted((String s1, String s2) -> {
		        if (s1.length() < s2.length()) return -1;
		        if (s1.length() > s2.length()) return 1;
		        return 0;
		    }
		)
		.forEach(System.out::println);
		
		System.out.println("\nNomes com A: ");
		names.stream().map( name -> 
			name.startsWith("A") ?
			name.concat(" - true") : 
			name.concat(" - false")
		).forEach(System.out::println);
		
		System.out.println("\nNomes por Tamanho:");
		String n = names.stream().sorted((String s1, String s2) -> {
		        if (s1.length() < s2.length()) return -1;
		        if (s1.length() > s2.length()) return 1;
		        return 0;
		    }
		)
		.collect(Collectors.joining(", "))
		.toUpperCase();
		System.out.println(n);
	}
}
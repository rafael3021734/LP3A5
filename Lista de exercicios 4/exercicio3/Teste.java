package br.com.streams.exercicio3;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste {

	public static void main(String[] args) {
		System.out.println("cem números aleatórios:");
		Stream.generate(()->new Random().nextInt(100)).limit(100).forEach(System.out::println);
		
		System.out.println("dez números aleatórios:");
		System.out.print("");
		List<Integer> nums = Stream.generate(()->new Random().nextInt(100))
				.limit(10)
				.collect(Collectors.toList());
		
		nums.forEach(System.out::println);
		
		Integer max = nums.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Maior: " + max);
		
		Integer min = nums.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Menor: " + min);
		
		Long count = nums.stream().count();
		System.out.println("Quantidade: " + count);
	}
}

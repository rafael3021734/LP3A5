package br.com.streams.exercicio2;

import java.util.stream.Stream;

public class Teste {

	public static void main(String[] args) {
		Stream<Integer> nums = Stream.iterate(0, n -> n + 1)
				.limit(10)
				.filter(num -> num % 2 == 0)
				.skip(2)
				.limit(2)
				.map(num -> num * 2);
		
		System.out.println("Resultado: ");
		nums.forEach(System.out::println);
	}
}

package br.com.streams.exercicio1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste {
	static int num;
	static Scanner in = new Scanner (System.in);
	public static void main(String[] args) {

		//Pegando o número 
		System.out.print("Digite um número: ");
		num = in.nextInt();
		
		//Criando a Stream
		List<Integer[]> collect = Stream.iterate(new Integer[]{1, 1}, n -> new Integer[]{n[0]+1, n[1]+1})
		.limit(num)
		.collect(Collectors.toList());
		
		System.out.print("Todos os números: ");
		collect.stream()
		.flatMap(num -> Stream.of(num))
		.forEach(System.out::print);
		
		System.out.print("\nTodos os números sem repetição: ");
		collect.stream()
		.flatMap(num -> Stream.of(num))
		.distinct()
		.forEach(System.out::print);
		
		System.out.print("\nÍmpares: ");
		collect.stream()
		.flatMap(num -> Stream.of(num))
		.distinct()
		.filter(num -> num % 2 == 1)
		.forEach(System.out::print);
		
		System.out.print("\nPares: ");
		collect.stream()
		.flatMap(num -> Stream.of(num))
		.distinct()
		.filter(num -> num % 2 == 0)
		.forEach(System.out::print);
		
		System.out.print("\nTodos os números sem repetição a partir do 5: ");
		collect.stream()
		.flatMap(num -> Stream.of(num))
		.distinct()
		.skip(4)
		.forEach(System.out::print);
		
		System.out.print("\nMultiplicado por 4: ");
		collect.stream()
		.flatMap(num -> Stream.of(num))
		.distinct()
		.map(num -> num * 4)
		.forEach(System.out::print);
	}
}
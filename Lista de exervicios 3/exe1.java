package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class exe1 {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		//avaliaExpressao(list, (n) -> true);
		//avaliaExpressao(list, (n) -> false);
		//avaliaExpressao(list, (n) ->  n * n > 0);
		System.out.println("Todos os Numeros");
		avaliaExpressao(num, (n) -> true);
		//avaliaExpressao2(num,(n) -> true);
		System.out.println("Quadrado");
		avaliaExpressao2(num,(n) -> n * n);
		System.out.println("Dobro");
		avaliaExpressao2(num,(n) -> n * 2);
		System.out.println("Soma de n + 3");
		avaliaExpressao2(num,(n) -> n + 3);
		//avaliaExpressao(list, (n) -> n % 2 == 1);
		//avaliaExpressao(list, (n) -> n > 5);
		//avaliaExpressao(list, (n) -> n > 5 && n < 10);
	}

	public static void avaliaExpressao(List<Integer> num, Predicate<Integer> predicate) {
		num.forEach(n -> {
			if (predicate.test(n)) {
				System.out.println(n);
			}
		});
	}

	public static void avaliaExpressao2(List<Integer> numero, IntFunction<Integer> func) {
		numero.forEach(n -> {
			n = func.apply(n);
				System.out.println(n);
			});
	}
}



package br.com.lp3a5.lambda1.exercicio.e3;

import java.util.function.Function;

public class Calculadora {
	
	static class Fatorial {
        Function<Integer, Integer> func;
    }

    public static void main(String[] args) {
        final Fatorial fat = new Fatorial();
        fat.func = x -> x == 0 ? 1 : x * fat.func.apply(x - 1);
        System.out.println("Fatorial: "+ fat.func.apply(5));
    }
}

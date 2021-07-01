package br.com.lp3a5.lambda1.exercicio.e1;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class Teste {

    public static void main(String [] a)  {

    	System.out.println("Cria a lista com os elementos que serão realizadas operações");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        
        System.out.println("Imprime todos os elementos:");
        realizaOperacao(list, (n)-> n);
        
        System.out.println("O dobro de todos os elementos da lista:");
        realizaOperacao(list, (n)-> n * 2);

        System.out.println("Calcula o quadrado de todos os elementos da lista:");
        realizaOperacao(list, (n)-> n * n);

        System.out.println("Soma 3 em todos os elementos da lista:");
        realizaOperacao(list, (n)-> n + 3);
    }

    public static void realizaOperacao(List<Integer> list, IntFunction<Integer> function) {
        list.forEach(n -> {
        	n = function.apply(n);
        	System.out.println(n + " ");
        });
    }
}

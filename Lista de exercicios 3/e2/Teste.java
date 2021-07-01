package br.com.lp3a5.lambda1.exercicio.e2;

import java.util.function.IntToDoubleFunction;

public class Teste {

	public static void main(String[] args) {
		InterfaceFuncional func = ()->System.out.println("Hello world");
        func.show();
	}
}

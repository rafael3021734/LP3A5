package Exercicios;

import java.util.function.Function;

public class exe3 {

	public static void main(String[] args) {
		
		Teste t = new Teste();
		
		t.f = (n) ->{
			if(n == 1) {
				return n;
			};
			System.out.println(t.f.apply(n-1));
			return n;
		};
		
		System.out.println(t.f.apply(5));
	}
	
	public static class Teste {
		Function<Integer, Integer> f;
	}

}

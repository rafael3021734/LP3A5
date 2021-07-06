package Exercicios5;

import java.util.Optional;

public class ex2 {

	public static void main(String[] args) {
		
		  String s = "1";
		  String y = "";
		    
		    Optional<Integer> numero = converteEmNumero(s);
		    Optional<Integer> numero1 = converteEmNumero(y);
		    
		//    System.out.println(numero);
		//    System.out.println(numero.isPresent());
		//    System.out.println(numero.get());
		    
		//    numero.ifPresent(n -> System.out.println(n));
		    
		    Integer orElseThrow = numero.orElseThrow(() -> new NullPointerException());
		    System.out.println(orElseThrow);
		    
		    Integer orElseThrow1 = numero1.orElseThrow(() -> new NullPointerException());
		    System.out.println(orElseThrow1);

	}
	public static Optional<Integer> converteEmNumero(String numeroStr) {
	    
	    try {
	      Integer integer = Integer.valueOf(numeroStr);
	      return Optional.of(integer);
	    } catch (Exception e) {
	      return Optional.empty();
	    }
	    
	  } 
		
	

}

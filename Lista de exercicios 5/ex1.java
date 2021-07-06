package Exercicios5;

import java.util.Optional;

public class ex1 {

	public static void main(String[] args) {
		
		  String s = "";
		  String y = "1";
		    
		    Optional<Integer> numero = converteEmNumero(s);
		    Optional<Integer> numero1 = converteEmNumero(y);
		    
		   // System.out.println(numero);
		   // System.out.println(numero.isPresent());
		   // System.out.println(numero.get());
		    
		   // numero.ifPresent(n -> System.out.println(n));
		    
		    Integer orElse = numero.orElse(2);
		    System.out.println(orElse);
		    
		    Integer orElse1 = numero1.orElse(3);
		    System.out.println(orElse1);		    
		    
		    Integer orElseGet = numero.orElseGet(() -> 5);
		    System.out.println(orElseGet);
		    
		    Integer orElseGet1 = numero1.orElseGet(() -> 6);
		    System.out.println(orElseGet1);

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

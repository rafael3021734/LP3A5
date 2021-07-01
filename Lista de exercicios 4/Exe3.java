package Exercicios4;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Stream;

public class Exe3 {

	public static void main(String[] args) {
		
		int i ;
	    ArrayList<Integer> lista = new ArrayList<Integer>();
	   
	    Random random = new Random();
	    
	         for (i = 0; i < 100; i++)
	    {
	        lista.add(random.nextInt(1000));
	        
	    }
	            Stream<ArrayList<Integer>> mycollect = Stream.of(lista)
	                    .flatMap(Stream::of)
	                    .limit(100);

	                    mycollect.forEach(s->System.out.println(s));
	                     System.out.println("\n Quantidade: " + i);

	                        OptionalInt max = lista.stream().mapToInt(Integer::intValue).max();
	                            System.out.println("\n Maior valor: " + max);
	                            
	                            
	                            OptionalInt mymin = lista.stream().mapToInt(Integer::intValue).min();
	                            System.out.println("\n Menor valor: " + mymin);
	                            
	                            
	                            
	                            System.out.println("\n\n SEGUNDA LISTA ");
	                            
	                            
	                             ArrayList<Integer> lista2 = new ArrayList<Integer>();
	                             
	                                 for (i = 0; i < 10; i++)
	                                   {
	                                     lista2.add(random.nextInt(1000));
	        
	                                    }
	                             
	                             Stream<ArrayList<Integer>> mycollect2 = Stream.of(lista2)
	                            .flatMap(Stream::of)
	                            .limit(10);
	                             
	                             
	                             
	                             mycollect2.forEach(x->System.out.println(x));
	                     System.out.println("\n Quantidae: " + i);
	                             
	                            OptionalInt max2 = lista2.stream().mapToInt(Integer::intValue).max();
	                            System.out.println("\n Maior valor: " + max2);
	                            
	                            
	                            OptionalInt mymin2 = lista2.stream().mapToInt(Integer::intValue).min();
	                            System.out.println("\n Menor valor: " + mymin2);            

	    }    
	
}

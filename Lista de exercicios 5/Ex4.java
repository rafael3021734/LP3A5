package Exercicios5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex4 {

	public static void main(String[] args) {
		
		// Creating a List of Strings
        List<String> list = Arrays.asList( "Paulo","Camila","Ana Maria",
        						"Patrick","Ana Clara", "Pedro","Alfredo");                         
  
        // Using Stream findAny() to return
        // an Optional describing some element
        // of the stream
        Optional<String> answer = list.stream().findAny().filter(name -> name.startsWith("W"));
  
        // if the stream is empty, an empty
        // Optional is returned.
        if (answer.isPresent()) {
            System.out.println(answer.get());
        }
        else {
        	String orElseThrow = answer.orElseThrow(() -> new NullPointerException());
		    System.out.println(orElseThrow);
        }
    
	}	    
	  
}

package Exercicio7.Ex1;


	import java.util.InputMismatchException;
import java.util.Scanner;

import Excecao.SaldoException;

	public class e1 {

	  public static int calculaQuociente(int numerador, int denominador) throws ArithmeticException{
	    return numerador / denominador;
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    boolean continua = true;

	    do{
	      try{
	        System.out.print("Numero 1: ");
	        int numero1 = sc.nextInt();

	        System.out.print("Numero 2: ");
	        int numero2 = sc.nextInt();
	        	        
	        
	        if(numero1 < 0 || numero2 < 0) throw new ResultadoNegativo();
	        	
	 	        System.out.println("Resultado é positivo ");
	 	        
	 	    if(numero1 > 1000 || numero2 > 1000) throw new Resultado();
	
	 	   //     System.out.println("Resultado é positivo ");
	 	   System.out.println("Digite um valor para o Numerador"); 
	 	   int numerador = sc.nextInt();
	 	   
	 	   System.out.println("Digite um valor para o Denominador"); 
	 	   int denominador = sc.nextInt();
	 	   int resultador = calculaQuociente(numerador, denominador);
	        System.out.println("Resultado: "+resultador);

	        continua = false;

	      }catch (InputMismatchException erro1) {
	        System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
	        sc.nextLine(); //descarta a entrada errada do usuário	
	      }catch(ArithmeticException err){
		        System.err.println("O número do divisor deve ser diferente de 0!");
	      }finally{
	        System.out.println("Finalizada a execução!");
	      }
	    }while(continua);
	  }
	
	  
}	
	

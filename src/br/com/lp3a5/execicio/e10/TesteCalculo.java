package br.com.lp3a5.execicio.e10;

import java.util.Scanner;

public class TesteCalculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Qual o primeiro numero?");
        double num1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Qual o operador?");
        String operador = sc.next();
        sc.nextLine();
        System.out.println("Qual o segundo numero?");
        double num2 = sc.nextDouble();

        Calculo calculadora = new Calculo(num1, num2, operador);
        Thread t = new Thread(calculadora);
        sc.close();
		
	}

}

package br.com.lp3a5.execicio.e12;

import java.util.Scanner;

public class TesteSoma {

	public static void main(String[] args) {
		int stop;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o n�mero de partida?");
        int start = sc.nextInt();
        sc.nextLine();

        do {
            System.out.println("Qual o n�mero alvo?");
             stop = sc.nextInt();
            sc.nextLine();
        } while (stop < start);

        Thread t = new Thread(new Soma(start, stop));
        t.start();

        sc.close();
	}
}

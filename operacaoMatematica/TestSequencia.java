package operacaoMatematica;

import java.util.Locale;
import java.util.Scanner;

public class TestSequencia {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Sequencia thread1 = new Sequencia();
		Sequencia thread2 = new Sequencia(3, 1000, 3);

		System.out.print("Digite um numero: ");
		thread1.numero1 = sc.nextInt();

		System.out.print("Digite um tempo: ");
		thread1.tempo = sc.nextInt();

		System.out.print("Digite um qtd: ");
		thread1.qtd = sc.nextInt();

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Programa finalizado teste2");
	}

}

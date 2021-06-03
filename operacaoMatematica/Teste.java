package operacaoMatematica;

public class Teste {
	public static void main(String[] args) {
		Soma thread1 = new Soma(1, 2, 500);
		Soma thread2 = new Soma(3, 4, 1000);
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

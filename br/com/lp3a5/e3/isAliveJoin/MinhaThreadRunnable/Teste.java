package br.com.lp3a5.e3.isAliveJoin.MinhaThreadRunnable;

public class Teste {
	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("##2", 1000);
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.start();
		t2.start();
		while (t1.isAlive() || t2.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Programa finalizado");
	}
}
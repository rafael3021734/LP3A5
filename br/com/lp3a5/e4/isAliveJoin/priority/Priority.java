package br.com.lp3a5.e4.isAliveJoin.priority;

import br.com.lp3a5.e3.isAliveJoin.MinhaThreadRunnable.MinhaThreadRunnable;

public class Priority {
	public static void main(String[] args) {
		MinhaThreadRunnable thred1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thred2 = new MinhaThreadRunnable("##2", 500);
		MinhaThreadRunnable thred3 = new MinhaThreadRunnable("###3", 500);
		Thread t1 = new Thread(thred1);
		Thread t2 = new Thread(thred2);
		Thread t3 = new Thread(thred3);
		t1.setPriority(10);// de 1 a 10
		t2.setPriority(3);
		t3.setPriority(1);
		t2.start();
		t3.start();
		t1.start();
	}
}
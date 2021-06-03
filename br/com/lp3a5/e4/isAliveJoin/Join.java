package br.com.lp3a5.e4.isAliveJoin;

public class Join {
	public static void main(String[] args) throws InterruptedException {
		Thread z = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 6; i++) {
					System.out.println("Thread z - contador " + i);
				}
			}
		});
		Thread y = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					z.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < 6; i++) {
					System.out.println("Thread y - contador " + i);
				}
			}
		});
		y.start();
		z.start();
	}
}
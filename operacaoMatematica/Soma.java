package operacaoMatematica;

public class Soma implements Runnable {
	private int numero1;
	private int numero2;
	private int tempo;

	public Soma(int numero1, int numero2, int tempo) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.tempo = tempo;
	}

	@Override
	public void run() {
		try {
				int result = numero1 + numero2;
				System.out.println("soma é " + result);
				Thread.sleep(tempo);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" terminou a execução");
	}

}

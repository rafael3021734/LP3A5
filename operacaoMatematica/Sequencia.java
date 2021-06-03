package operacaoMatematica;

public class Sequencia implements Runnable {
	public int numero1;
	public int tempo;
	public int qtd;

	public Sequencia() {};
	public Sequencia(int numero1, int tempo, int qtd) {
		this.numero1 = numero1;
		this.tempo = tempo;
		this.qtd = qtd;
	}

	@Override
	public void run() {
	 try {
			
		if(qtd < numero1){
			int result= 0;
			for(int i=0; i<qtd; i++) {
				result += numero1;				
			}
				System.out.println("soma é " + result);
				Thread.sleep(tempo);
			}
			
	} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" terminou a execução");
	}



}

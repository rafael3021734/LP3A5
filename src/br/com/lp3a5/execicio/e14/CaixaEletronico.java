package br.com.lp3a5.execicio.e14;

import static java.lang.Thread.sleep;

public class CaixaEletronico {
	private Double saldo;
	public static boolean caixaVazio = true;

    public CaixaEletronico(Double saldo) {
        this.saldo = saldo;
    }

    public synchronized void saque(Double valor) {
    	try {
    		while(caixaVazio)
    			wait();
    		sleep(8000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    	
        System.out.println("Realizando saque de " + valor);

        if (valor > this.saldo)
            throw new IllegalArgumentException("****** Valores insuficientes para saque de " + valor);
        
        System.out.println("Sacando "+ valor);
        this.saldo = this.saldo - valor;
        
        notifyAll();
        
        System.out.println(valor + " sacados");
        System.out.println("****** Saldo: " + saldo);
    }

    public synchronized void transferir(Double valor) {
    	try {
    		while(caixaVazio)
    			wait();
    		sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    	
        System.out.println("Realizando transferência de " + valor);
        
        if (valor > this.saldo)
            throw new IllegalArgumentException("****** Valores insuficientes para transferência de " + valor);
        
        System.out.println("Tranferindo "+ valor);
        this.saldo = this.saldo - valor;

        System.out.println(valor + " transferido");
        System.out.println("****** Saldo: " + saldo);
        
        notifyAll();
    }
    
    public synchronized void alimentarCaixa(double valor){
        
        System.out.println("***********Recolocando dinheiro, caixa em espera por 10s");
        this.saldo += valor;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        caixaVazio = false;
        notifyAll();
    }
}

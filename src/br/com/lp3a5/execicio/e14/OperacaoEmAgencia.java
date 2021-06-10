package br.com.lp3a5.execicio.e14;

public class OperacaoEmAgencia implements Runnable{
	private static final CaixaEletronico caixa = new CaixaEletronico(0.00);
    private String operacao;
    private double valor;
    Thread t;

    public OperacaoEmAgencia(String operacao, double valor) {
        this.operacao = operacao;
        this.valor = valor;
        t = new Thread(this);
		t.start();
    }

    @Override
    public void run() {
    	try {
    		if (operacao.equalsIgnoreCase("saque"))
                caixa.saque(valor);
    		else if(operacao.equalsIgnoreCase("transferir"))
    			caixa.transferir(valor);
    		else if(operacao.equalsIgnoreCase("recarga"))
    			caixa.alimentarCaixa(valor);
    	} catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

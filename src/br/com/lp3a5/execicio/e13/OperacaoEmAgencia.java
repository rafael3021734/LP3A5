package br.com.lp3a5.execicio.e13;

public class OperacaoEmAgencia implements Runnable{
	private static final CaixaEletronico caixa = new CaixaEletronico(2000.00);
    private String operacao;
    private double valor;

    public OperacaoEmAgencia(String operacao) {
        this.operacao = operacao;
        new Thread(this).start();
    }

    public OperacaoEmAgencia(String operacao, double valor) {
        this.operacao = operacao;
        this.valor = valor;
        new Thread(this).start();
    }

    @Override
    public void run() {
    	try {
    		if (operacao.equalsIgnoreCase("saque"))
                caixa.saque(valor);
    		else
    			caixa.transferir(valor);
    	} catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

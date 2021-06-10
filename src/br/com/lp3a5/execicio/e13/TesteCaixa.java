package br.com.lp3a5.execicio.e13;

public class TesteCaixa {

	public static void main(String[] args) {
        OperacaoEmAgencia saque1 = new OperacaoEmAgencia("saque", 100.00);
        OperacaoEmAgencia transferencia1 = new OperacaoEmAgencia("transferencia", 100.00);

        OperacaoEmAgencia saque2 = new OperacaoEmAgencia("saque", 2000.00);
        OperacaoEmAgencia transferencia2 = new OperacaoEmAgencia("transferencia", 2000.00);

        OperacaoEmAgencia saque3 = new OperacaoEmAgencia("saque", 200.00);
        OperacaoEmAgencia transferencia3 = new OperacaoEmAgencia("transferencia", 200.00);
	}
}

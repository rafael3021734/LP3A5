package br.com.lp3a5.execicio.e14;

public class TesteCaixa {

	public static void main(String[] args) {
		OperacaoEmAgencia transferir = new OperacaoEmAgencia("transferir", 100.00);
        OperacaoEmAgencia saque = new OperacaoEmAgencia("saque", 200.00);
        OperacaoEmAgencia saque1 = new OperacaoEmAgencia("saque", 100.00);
        OperacaoEmAgencia transferir1 = new OperacaoEmAgencia("transferir", 100.00);
        OperacaoEmAgencia recarga = new OperacaoEmAgencia("recarga", 2000.00);
	}
}
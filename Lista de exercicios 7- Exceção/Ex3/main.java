package Exercicio7.Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Usuario usuario = new Usuario();
		Vendas vendas = new Vendas();
		
		
		try {
		    
		cliente.setIdCliente(1);
		cliente.setNome("Amanda");
		cliente.setEndereco("Rua Santa Izabel, 555");
		cliente.setBairro("Vila augusta");
		cliente.setCidade("Guarulhos");
		cliente.setEstado("São Paulo");
		
		usuario.setIdUsuario(2);
		usuario.setNome("Vinicius");
		usuario.setLogin("Vinic");
		usuario.setSenha("12345");	
			
		System.out.println("Deseja cadastrar um produto!");
		String Produto = scan.nextLine();
		int idProduto = scan.nextInt();
				
		Produto produto = new Produto(idProduto, Produto);
		
		if (idProduto == 0) throw new SemEstoque();
			
		List<Vendas> list = new ArrayList<>();

			list.add(new Vendas(1111, produto, cliente));
			list.add(new Vendas(2222, produto, cliente));
			list.add(new Vendas(3333, produto, cliente));
			list.add(new Vendas(4444, produto, cliente));
			
			for (Vendas n : list) {
				System.out.println();
			}	
			System.out.println("Imprime todos os elementos da lista!");
			list.stream()			
			.forEach((n) -> {
				System.out.println(n);
				});	
		
		}catch(Exception e){
			
			System.out.println("sistema:"+ e.getMessage());
		}
		
	}

}

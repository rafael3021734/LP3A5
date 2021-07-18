package Exercicio7.Ex3;

public class Vendas {
	
	private int idVendas;
	private Produto idProduto;
	private  Cliente idCliente;
	
	public Vendas() {
		super();	
	}
	
	public Vendas(int idVendas, Produto idProduto, Cliente idCliente) {
		super();
		this.idVendas = idVendas;
		this.idProduto = idProduto;
		this.idCliente = idCliente;
	}

	public int getIdVendas() {
		return idVendas;
	}

	public void setIdVendas(int idVendas) {
		this.idVendas = idVendas;
	}

	public Produto getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Produto idProduto) {
		this.idProduto = idProduto;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Vendas [idVendas=" + idVendas + ", idProduto=" + idProduto + ", idCliente=" + idCliente + "]";
	}
		
}

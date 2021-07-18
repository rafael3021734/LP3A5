package Exercicio7.Ex3;

public class Produto {

	private int idProduto;
	private String Produto;
	public Produto(int idProduto, String produto) {
		super();
		this.idProduto = idProduto;
		Produto = produto;
	}
	public Produto() {
		super();
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getProduto() {
		return Produto;
	}
	public void setProduto(String produto) {
		Produto = produto;
	}
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", Produto=" + Produto + "]";
	}
		
}

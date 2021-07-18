package Exercicio7.Ex3;

public class Cliente {

	private int idCliente;
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Cliente() {
		super();
	}	
	
	public Cliente(int idCliente, String nome, String endereco, String bairro, String cidade, String estado) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void cadastrarCliente(int idCliente) {
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", endereco=" + endereco + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", estado=" + estado + "]";
	}	
}

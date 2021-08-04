package Javareflexao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Aluno {

	private int codigo;
	private String nome;
	private String numMatricula;
	private GregorianCalendar dataMatricula;
	private ArrayList<Double> nota; 
	private double media;
	
	public Aluno() {
		nota = new ArrayList<>();
		dataMatricula = new GregorianCalendar();
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
		
	}	
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;		
	}
	public String getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;		
	}	
	public GregorianCalendar getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(GregorianCalendar dataMatricula) {
		this.dataMatricula = dataMatricula;
	}	

	/*public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}*/
	public ArrayList<Double> getNota() {
		return nota;
	}
	public void setNota(ArrayList<Double> nota) {
		this.nota = nota;
	}
	/*public void allNotas(double nota) {
		List<Double>notas = new ArrayList<>();
		notas.add(nota);
		System.out.println("Notas adquiridas: " + notas);
	}*/
	
	public  void addNota(double nota) {	
		this.nota.add(nota);
		
	}		
	public double mediaNota(ArrayList<Double> nota) {
		
		Double notas = null;
		
		for (Double nota1 : nota) {
		  notas += nota1;
		  //System.out.println(notas);
		}
		//return media = notas;*/
		//nota.stream()
		//.map(media -> ++nota )
		//.forEach(System.out::println);
		media = notas;
		return media;
	}
		
	public void imprimirDados() {
		System.out.println("codigo:" + codigo);
		System.out.println("nome:" + nome);
		System.out.println("numMatricula:" + numMatricula);
		System.out.println("dataMatricula:" + dataMatricula);
		System.out.println("notas:" + nota);
		//allNotas(this.nota);
		mediaNota(this.nota);
		System.out.println("média Final:" + media);
		
	}
	
}

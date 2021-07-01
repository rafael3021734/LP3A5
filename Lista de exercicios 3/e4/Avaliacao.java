package br.com.lp3a5.lambda1.exercicio.e4;

import java.util.List;
import java.util.function.Predicate;

public class Avaliacao {
	private String nomeDisciplina;
	private String nomeAluno;
	private double nota;
	
	public Avaliacao(String nomeDisciplina, String nomeAluno, double nota) {
		this.nomeDisciplina = nomeDisciplina;
		this.nomeAluno = nomeAluno;
		this.nota = nota;
		
		new Thread(()->{
			System.out.println(Thread.currentThread().getName() + ": " + this.nomeAluno);
		}).start();
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public static void imprimir(List<Avaliacao> list, Predicate<Avaliacao> predicate) {
		list.forEach(n -> {
			if (predicate.test(n)) {
				System.out.println(n.nomeAluno + ", nota: "+ n.nota);
			}
		});
	}
}

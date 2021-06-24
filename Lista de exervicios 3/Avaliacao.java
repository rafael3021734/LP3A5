package Exercicios;

public class Avaliacao {

	private String Disciplina;
	private String Aluno;
	private int Nota;
	
	
	public Avaliacao(String disciplina, String nome, int nota) {
		super();
		Disciplina = disciplina;
		Aluno = nome;
		Nota = nota;
	}
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	public String getAluno() {
		return Aluno;
	}
	public void setAluno(String nome) {
		Aluno = nome;
	}
	public double getNota() {
		return Nota;
	}
	public void setNota(int nota) {
		Nota = nota;
	}
	
	
}

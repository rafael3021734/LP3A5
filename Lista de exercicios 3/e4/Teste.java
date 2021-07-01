package br.com.lp3a5.lambda1.exercicio.e4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.lp3a5.lambda1.exemplo3.Pessoa;

public class Teste {

	public static void main(String[] args) {
		List<Avaliacao> listAvaliacao = Arrays.asList(
				new Avaliacao("LP3A5", "Nati", 9.0),
				new Avaliacao("LP3A5", "Caio", 6.0),
				new Avaliacao("LP3A5", "John", 5.0),
				new Avaliacao("LP3A5", "Ana", 6.0));
		
		System.out.println("Ordenando pelo nome...");
		Collections.sort(listAvaliacao, (Avaliacao aluno1, Avaliacao aluno2)
		    -> aluno1.getNomeAluno().compareTo(aluno2.getNomeAluno())
		);
		
		System.out.println("Lista de Aprovados em LP3A5");
		Avaliacao.imprimir(listAvaliacao, (n) -> n.getNota() >= 6);
	}
}

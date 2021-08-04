package Javareflexao;

import java.lang.reflect.InvocationTargetException;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
	
	Aluno A = new Aluno();
	A.setCodigo(1);
	A.setNome("saulo");
	A.setNumMatricula("123456");
	A.addNota(10);
	A.addNota(5);
	A.imprimirDados();
	}
}

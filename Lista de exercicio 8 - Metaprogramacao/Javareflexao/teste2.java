package Javareflexao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class teste2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
	
Class minhaClasse = Class.forName("Javareflexao.Aluno");
		
		Object aluno = minhaClasse.getConstructor().newInstance();
		
		Field F = aluno.getClass().getDeclaredField("nome");
		F.setAccessible(true);
		F.set(aluno, "scc");
		
		F = aluno.getClass().getDeclaredField("codigo");
		F.setAccessible(true);
		F.set(aluno, 9);
		Class[] parametros = new Class[1];
		parametros[0] = double.class;
		Method M = aluno.getClass().getDeclaredMethod("addNota", parametros);
		M.invoke(aluno, 99.9);
		M = aluno.getClass().getDeclaredMethod("imprimirDados");
		M.invoke(aluno);
		
		Reflexao.refletirObjeto(aluno, aluno.getClass());
	}
	
}

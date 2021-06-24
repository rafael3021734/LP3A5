package Exercicios;

import java.util.ArrayList;

public class exe4 {

	public static void main(String[] args) {
		ArrayList<Avaliacao> avList = new ArrayList();
		
		new Thread(() ->  {
			Avaliacao av = new Avaliacao("LP3A5", "PAULO", 10);
			Avaliacao av1 = new Avaliacao("LP3A5", "LUIS", 10);
			Avaliacao av2 = new Avaliacao("LP3A5", "CAROL", 10);
			
			avList.add(av);
			avList.add(av1);
			avList.add(av2);			
		});		
		//avList.sort(a1,a2) a1,a2 -> a1.getAluno().compareTo(a2.getAluno());
		
		avList.forEach( p -> System.out.println(p.getAluno()));
		
		};
	//}
}

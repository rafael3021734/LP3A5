package br.com.lp3a5.execicio.e11;

public class TesteContador {

	public static void main(String[] args) {
		String[] aTestar = {"aaauiuouoiuia",
                "hkjhkjkjbdjjb",
                "Eu to linda, livre, leve, e solta"};

        for(String s : aTestar){
            Thread t = new Thread(new Contador(s));
            t.start();
        }
	}
}

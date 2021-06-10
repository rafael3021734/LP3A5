package br.com.lp3a5.execicio.e12;

import java.util.ArrayList;

public class Soma implements Runnable{
	private final Integer start, stop;
	private Integer soma=0;

    public Soma(Integer start, Integer stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {
        ArrayList<Integer> resultado = listarNumeros();
        System.out.println("Para somar " + stop + " a partir de " + start +
                " são necessários " + resultado.size());
        System.out.println(resultado);
        
        for (Integer n: resultado) {
        	soma += n;
        }
        
        System.out.println(soma);
    }

    private ArrayList<Integer> listarNumeros (){
        int soma = 0;
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int i = start; soma < stop; i++) {
            soma += i;
            resultado.add(i);
        }
        return resultado;
    }
}

package br.com.lp3a5.execicio.e11;

import java.util.HashMap;

public class Contador implements Runnable{
	private final String VOGAIS = "vogal";
    private final String CONSOANTE = "consoante";
    private final String frase;

    public Contador(String frase) {
        this.frase = frase;
    }

    @Override
    public void run() {
        HashMap<String, Integer> resultado = contador();
        System.out.println("Frase: " + frase +"\nVogais: " + resultado.get(VOGAIS) +
                "\nconsoantes: " + resultado.get(CONSOANTE)+"\n");
    }

    private HashMap<String, Integer> contador(){
        HashMap<String, Integer> resultado = new HashMap<>();
        resultado.put(VOGAIS, 0);
        resultado.put(CONSOANTE, 0);
        for (Character c : frase.toCharArray()){
            try {
                if (isVowel(c)) {
                    incf(resultado, VOGAIS);
                } else {
                    incf(resultado, CONSOANTE);
                }
            } catch (IllegalArgumentException ignored) {
            }

        }
        return resultado;
    }

    private boolean isVowel(Character c){
        switch (c){
            case 'a': case '�': case '�': case '�': case '�':
            case 'e': case '�': case '�':
            case 'i': case '�': case '�':
            case 'o': case '�': case '�': case '�':
            case 'u': case '�': {
                return true;
            }
            case ',': case '.': case':': case '!': case'?': case ' ':
                throw new IllegalArgumentException();
            default:{
                return false;
            }
        }
    }

    private void incf (HashMap<String, Integer> map, String field){
        map.put(field, map.get(field) + 1);
    }
}

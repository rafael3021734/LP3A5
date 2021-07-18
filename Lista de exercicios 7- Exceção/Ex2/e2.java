package Exercicio7.Ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class e2 {
	public static void main(String[] args)
	{
	lerArquivo1();
	
}
	
public static void lerArquivo1(){
	
	try{
	Reader	reader = new BufferedReader(new FileReader("arquivo.txt"));
	}catch (Exception e) {
		e.printStackTrace();
	}
  }
}

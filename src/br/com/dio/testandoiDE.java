package br.com.dio;

import br.com.dio.model.Gato;

public class testandoiDE {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();		
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("hello world!" + (a+b));*/
	}

}

class Livros {
	public String livro;
	public Integer npag;
}
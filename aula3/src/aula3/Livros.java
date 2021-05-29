package aula3;

public class Livros {
	
	String nome;
	String autor;
	String genero;
	String tipoDeMidia;
	String anoDePublicacao;
	String editora;
	String prefacio;
	String idioma;
	String isbn;
	String edicao;
	
	void exibirLivro() {
		System.out.println("nome " + nome);
		System.out.println("autor " + autor);
		System.out.println("genero " + genero);
		System.out.println("tipoDeMidia " + tipoDeMidia);
		System.out.println("anoDePublicacao " + anoDePublicacao);
		System.out.println("editora " + editora);
		System.out.println("prefacio " + prefacio);
		System.out.println("idioma " + idioma);
		System.out.println("edicao " + edicao);
		System.out.println("isbn " + isbn);
		System.out.println("---------");
	}
	
}

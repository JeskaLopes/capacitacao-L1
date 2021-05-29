package aula3;

public class TesteLivros {

	public static void main(String[] args) {
		
		Livros livro1 = new Livros();
		
		livro1.nome = "Java";
		livro1.autor = "Jessica";
		livro1.genero = "Programacao";
		livro1.tipoDeMidia = "Fisica";
		livro1.anoDePublicacao = "2021";
		livro1.editora = "Antena";
		livro1.prefacio = "teste";
		livro1.idioma = "portugues";
		livro1.isbn = "123";
		livro1.edicao = "0";
		
		livro1.exibirLivro();
		
		Livros livro2= new Livros();
		
		livro1.nome = "CSS";
		livro1.autor = "Camilla";
		livro1.genero = "Programacao";
		livro1.tipoDeMidia = "Digital";
		livro1.anoDePublicacao = "2022";
		livro1.editora = "Epoca";
		livro1.prefacio = "Livro sobre css";
		livro1.idioma = "Portugues";
		livro1.isbn = "123";
		livro1.edicao = "0";
		
		livro2.exibirLivro();
		
	}

}

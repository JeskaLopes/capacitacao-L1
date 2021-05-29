package aula3;

public class Professor {
	
	//definindo atributos da classe

	String nome;
	String materia;
	String escola;
	String anoLetivo;
	
	//definindo métodos da classe
	
	void mostraInformações() {
		System.out.println("Nome: " + nome);
		System.out.println("Matéria " + materia);
		System.out.println("Escola " + escola);
		System.out.println("Ano letivo " + anoLetivo);
	}
}

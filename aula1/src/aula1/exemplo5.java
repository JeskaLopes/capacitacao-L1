package aula1;
import java.util.Scanner;



public class exemplo5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome;
			
		System.out.println("Digite seu nome: ");
		nome = ler.next();
		
		System.out.println("Digite sua idade: ");
	    idade = ler.nextInt();
	    
	    
	    System.out.println("Oi " + nome + " tudo bom? " + "\n");
		System.out.println("Hoje sua idade � " + idade);


	}

}

package aula2;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//valida??o de usu?rio
		
		String nomeUsuario = "jessica", usuarioInputado;
		
		System.out.println("Digite seu usu?rio");
		usuarioInputado = ler.next();
		
		for (int tentativas=0; tentativas < 3; tentativas ++) {
			if(nomeUsuario.equals(usuarioInputado)) {
				System.out.println("Logado");
				System.out.println("Digite o primeiro numero");
				int numeroA = ler.nextInt();
				
				System.out.println("Digite o segundo numero");
				int numeroB = ler.nextInt();

				System.out.println("Digite a opera??o desejada 1-Soma, 2-Subtra??o, 3-Divis?o e 4-Multiplica??o");
				int operador = ler.nextInt();
				
				double valorFinal = 0;
				if(operador == 1) {
					valorFinal = (numeroA + numeroB);
				}
				
				else if(operador == 2) {
					valorFinal = (numeroA - numeroB);
				}
				
				else if(operador == 3) {
					valorFinal = (numeroA / numeroB);
				}
				
				else {
					valorFinal = (numeroA * numeroB);
				}
				
				System.out.println("Valor final " + valorFinal);
			}
			else {
				System.out.println("Usuario incorreto, tente novamente");
				usuarioInputado = ler.next();
			}	
		}
		
		System.out.println("Voc? excedeu o limite de tentativas, n?o vai rolar :/");
	}

}

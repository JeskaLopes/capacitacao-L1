package aula2;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//validação de usuário
		
		String nomeUsuario = "jessica", usuarioInputado;
		
		System.out.println("Digite seu usuário");
		usuarioInputado = ler.next();
		
		for (int tentativas=0; tentativas < 3; tentativas ++) {
			if(nomeUsuario.equals(usuarioInputado)) {
				System.out.println("Logado");
				System.out.println("Digite o primeiro numero");
				int numeroA = ler.nextInt();
				
				System.out.println("Digite o segundo numero");
				int numeroB = ler.nextInt();

				System.out.println("Digite a operação desejada 1-Soma, 2-Subtração, 3-Divisão e 4-Multiplicação");
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
		
		System.out.println("Você excedeu o limite de tentativas, não vai rolar :/");
	}

}

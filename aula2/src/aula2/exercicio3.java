package aula2;

import java.util.Scanner;

/*Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
	public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0;
		int maiorQ50 = 0;
		int menorQ21 = 0;
		
		while (idade != -99) {
			
			System.out.println("Digite a idade");
			idade = ler.nextInt();
			
			if(idade > 50) {
				maiorQ50++;
			}
			if(idade < 21 && idade != -99) {
				menorQ21++;
			}
		}
		
		System.out.println("Maior que cinquenta " + maiorQ50);
		System.out.println("Menor que 21 " + menorQ21);
	}
}

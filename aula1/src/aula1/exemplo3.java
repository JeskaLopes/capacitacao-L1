package aula1;

public class exemplo3 {

	public static void main(String[] args) {
		// escopo de variáveis
		
		//boa pratica
		int valorA = 10, valorB = 30, resultado = 0;
		
		//int valorA = 10;
		//int valorB = 20;
		
		resultado = valorA + valorB; 
		
		System.out.println("Soma: " + resultado);
		
		resultado = valorA - valorB;
		
		System.out.println("Subtração: " + resultado);
		
		resultado = valorA * valorB;
		
		System.out.println("Multiplicação: " + resultado);
	}
}

package aula3;

public class ContaCorrente {
	
	//atributos
	String nome;
	String numeroConta;
	String agencia;
	String pix;
	double saldo;
	
	//m�todos
	void extrato() {
		System.out.println("----Informa��es da conta do cliente----" + "\n");
		System.out.println("Nome da conta: " + nome);
		System.out.println("N�mero da conta: " + numeroConta);
		System.out.println("Ag�ncia da conta: " + agencia);
		System.out.println("Chave PIX da conta: " + pix);
		System.out.println("Saldo da conta: " + saldo);
		System.out.println("---------------------");
	};
	
}

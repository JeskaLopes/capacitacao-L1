package aula3;

public class TesteBanco {

	public static void main(String[] args) {
		
		//instancia da classe cliente
		ClienteBanco cliente1 = new ClienteBanco();
		
		//atribuindo valores 
		cliente1.nome = "Maria";
		cliente1.endereco = "Rua recife n�127";
		cliente1.cep = 6807410L ;
		cliente1.telefone = 40028922L;
		cliente1.email = "maria@outlook.com";
		
		//metodo mostrando detalhes do cliente
		cliente1.mostrarDetalhes();
		
		
		//instancia da classe conta
		ContaCorrente conta1 = new ContaCorrente();
		
		//atribuindo valores
		conta1.nome = "Corrente";
		conta1.numeroConta = "2200-7";
		conta1.agencia = "002";
		conta1.pix = "1188899998";
		conta1.saldo = 1.000;
		
		//metodo mostrando extrato da conta
		conta1.extrato();
		
	}

}

//ao colocar nextLong() o valor j� recebe o L 
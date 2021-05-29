package aula3;

public class ClienteBanco {
	
	//atributos
	//boas praticas - numero grande com long
	String nome;
	String endereco;
	Long cep;
	Long telefone;
	String email;
	
	//métodos
	void mostrarDetalhes() {
		System.out.println("----Informações do cliente----" + "\n");
		System.out.println("Nome do Cliente: " + nome);
		System.out.println("Endereço do Cliente: " + endereco);
		System.out.println("CEP do Cliente: " + cep);
		System.out.println("Telefone do Cliente: " + telefone);
		System.out.println("Email do Cliente: " + email);
		System.out.println("-----------------------" + "\n");
	};
}

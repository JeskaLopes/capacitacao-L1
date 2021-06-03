package preparacaoAula;


public class aprovadoReprovado {

	public static void main(String[] args) {
		
		int nota = 49;
		
		if(nota >= 50 || nota == 100) {
			System.out.println("Aprovado");
		}
		
		if(nota < 50 ) {
			System.out.println("Reprovado");
		}
	}

}

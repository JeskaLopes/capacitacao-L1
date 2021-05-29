package exerciciosAula1;
import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos, dias = 365, totalDias;
		double meses;
		
		System.out.println("Digite quantos anos você tem: ");
		anos = ler.nextInt();
		
		totalDias = anos*dias;
		
		System.out.println("Você viveu " + totalDias + " até aqui, é tempo pra xuxu");
		
	}

}

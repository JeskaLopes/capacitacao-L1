package exerciciosAula1;
import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos, dias = 365, totalDias;
		double meses;
		
		System.out.println("Digite quantos anos voc� tem: ");
		anos = ler.nextInt();
		
		totalDias = anos*dias;
		
		System.out.println("Voc� viveu " + totalDias + " at� aqui, � tempo pra xuxu");
		
	}

}

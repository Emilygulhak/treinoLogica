import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int numero = ler.nextInt();
		
		if( numero >= 0) {
			System.out.println("N�mero recebido � positivo: " + numero);
		} else {
			System.out.println("N�mero recebido � negativo: " + numero);
		}

	}

}

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("S�o ou n�o multiplos !!?");
		
		System.out.println("Digite o primeiro n�mero: ");
		int a = ler.nextInt();
		
		System.out.println("Dite o segundo n�mero: ");
		int b = ler.nextInt();
		
		if( a % b == 0 || b % a == 0) {
			System.out.println("S�o multiplos !");
		} else {
			System.out.println("N�o s�o multiplos !");
		}
	}
}

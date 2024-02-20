import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("São ou não multiplos !!?");
		
		System.out.println("Digite o primeiro número: ");
		int a = ler.nextInt();
		
		System.out.println("Dite o segundo número: ");
		int b = ler.nextInt();
		
		if( a % b == 0 || b % a == 0) {
			System.out.println("São multiplos !");
		} else {
			System.out.println("Não são multiplos !");
		}
	}
}

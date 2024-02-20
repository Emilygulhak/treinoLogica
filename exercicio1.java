import java.util.Scanner;

public class exercicio1 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int valor2 = scan.nextInt();
		
		int somatoria = valor1 + valor2;
		
		System.out.println("SOMA = " + somatoria);
	}
}

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}

	}

}

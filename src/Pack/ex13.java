
import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valor1, valor2, valor3;

		System.out.printf("Digite um valor: ");
		valor1 = ler.nextDouble();

		System.out.printf("Digite um valor: ");
		valor2 = ler.nextDouble();

		System.out.printf("Digite um valor: ");
		valor3 = ler.nextDouble();

		ler.close();

		if (valor1 > valor2 && valor1 > valor3) {
			System.out.printf("O maior valor é: %.2f", valor1);
		}

		else if (valor2 > valor1 && valor2 > valor3) {
			System.out.printf("O maior valor é: %.2f", valor2);
		}

		else {
			System.out.printf("O maior valor é: %.2f", valor3);
		}

	}

}

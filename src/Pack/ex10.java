
import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valor1, valor2;

		System.out.printf("Digite um valor: ");
		valor1 = ler.nextDouble();

		System.out.printf("Digite um valor: ");
		valor2 = ler.nextDouble();

		ler.close();

		if (valor1 > valor2) {
			System.out.printf("Valor 1 é menor que valor2 ");
		}

		if (valor2 > valor1) {
			System.out.printf("Valor 2 é menor que valor 1 ");
		}

		if (valor2 == valor1) {
			System.out.printf("Valor 1 é idêntico ao valor 2 ");
		}

	}

}

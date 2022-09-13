
import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valor1, valor2;

		int opcao;

		System.out.printf("Digite o valor 1 : ");
		valor1 = ler.nextDouble();

		System.out.printf("Digite o valor 2 : ");
		valor2 = ler.nextDouble();

		System.out.println("-------------------- Calculadora --------------------");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Fim do programa");

		System.out.printf("Digite a opção: ");
		opcao = ler.nextInt();

		ler.close();

		if (opcao == 1) {
			System.out.printf("A soma é  %.1f", valor1 + valor2);
		}

		if (opcao == 2) {
			System.out.printf("A subtração é  %.1f", valor1 - valor2);
		}

		if (opcao == 3) {
			System.out.printf("A multiplicação é  %.1f", valor1 * valor2);
		}

		if (opcao == 4) {

			if (valor2 == 0) {
				System.out.printf("Não divisível por 0");
				return;
			}

			System.out.printf("A divisão é  %.1f", valor1 / valor2);
		}

	}

}

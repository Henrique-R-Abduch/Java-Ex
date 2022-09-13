
import java.util.Scanner;

public class ex22 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double lado, base, area, altura, opcao, raio;

		System.out.println("-------------------- Calculadora --------------------");
		System.out.println("1 - Triângulo");
		System.out.println("2 - Quadrado");
		System.out.println("3 - Retângulo");
		System.out.println("4 - Círculo");
		System.out.println("5 - Fim do programa");

		System.out.printf("Digite a opção: ");
		opcao = ler.nextDouble();

		if (opcao == 1) {
			System.out.printf("Digite o valor da base : ");
			area = ler.nextDouble();

			System.out.printf("Digite o valor da altura : ");
			altura = ler.nextDouble();

			System.out.printf("A área é do triângulo  %.1f", (area * altura) / 2);
		}

		if (opcao == 2) {
			System.out.printf("Digite o valor da base : ");
			lado = ler.nextDouble();

			System.out.printf("A área do quadro é  %.1f", lado * lado);
		}

		if (opcao == 3) {
			System.out.printf("Digite o valor da base : ");
			base = ler.nextDouble();

			System.out.printf("Digite o valor da altura : ");
			altura = ler.nextDouble();

			System.out.printf("A área do retângulo é %.1f", base * altura);
		}

		if (opcao == 4) {
			System.out.printf("Digite o valor do raio : ");
			raio = ler.nextDouble();

			System.out.printf("A área é círculo  %.1f", 3.14 * raio * raio);
		}

		ler.close();

	}

}

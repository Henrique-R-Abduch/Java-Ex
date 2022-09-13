
import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double lado1, lado2, lado3;

		System.out.printf("Digite o valor do lado: ");
		lado1 = ler.nextDouble();

		System.out.printf("Digite o valor do lado ");
		lado2 = ler.nextDouble();

		System.out.printf("Digite o valor do lado ");
		lado3 = ler.nextDouble();

		ler.close();

		if (lado1 < lado2 + lado3 && lado1 < lado2 + lado3 && lado1 < lado2 + lado3) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.printf("Triângulo equilátero");
			}

			else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.printf("Triângulo isósceles");
			}

			else {
				System.out.printf("Triângulo escaleno");
			}

		}

		else {
			System.out.printf("Não é um triângulo");
		}

	}

}

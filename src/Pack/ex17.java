
import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double peso, altura, imc;

		System.out.printf("Digite o valor da altura: ");
		peso = ler.nextDouble();

		System.out.printf("Digite o valor do peso: ");
		altura = ler.nextDouble();

		ler.close();

		imc = peso / (altura * altura);

		if (imc < 19) {
			System.out.printf("Abaixo do peso");
		}

		else if (imc >= 19 && imc <= 24) {
			System.out.printf("Peso ideal");
		}

		else if (imc > 24) {
			System.out.printf("Sobrepeso");
		}

	}

}

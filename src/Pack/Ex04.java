import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Double media, n1, n2, n3, n4;

		System.out.printf("informe o primeiro número: ");
		n1 = ler.nextDouble();

		System.out.printf("Informe o segundo número: ");
		n2 = ler.nextDouble();

		System.out.printf("Informe o terceiro número: ");
		n3 = ler.nextDouble();

		System.out.printf("Informe o quarto número: ");
		n4 = ler.nextDouble();

		media = (n1 + n2 + n3 + n4) / 4;

		System.out.printf("A média aritmética é %s", media);

		ler.close();

	}

}

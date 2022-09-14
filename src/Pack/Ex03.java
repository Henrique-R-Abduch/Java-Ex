import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double area, a, b;

		System.out.printf("Informe a base: ");
		b = ler.nextDouble();

		System.out.printf("Informe a altura: ");
		a = ler.nextDouble();

		area = (b * a) / 2;

		System.out.printf("A área do trângulo é de: %.2f", area);

		ler.close();
	}

}

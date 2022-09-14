import java.util.Scanner;

public class Ex35_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, i, tab;

		System.out.printf("Digite um valor positivo: ");
		a = ler.nextInt();

		while (a <= 0) {
			System.out.println("Valor inv�lido.");
			System.out.println("Digite um valor positivo: ");
			a = ler.nextInt();
		}

		i = 1;

		for (i = 1; i <= 10; i++) {
			tab = a * i;
			System.out.println(tab);
		}

	}

}

import java.util.Scanner;

public class Ex36_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, c, i, tab;

		System.out.printf("Digite um valor positivo para calcularmos a tabuada: ");
		a = ler.nextInt();

		while (a <= 0) {
			System.out.printf("Valor inv�lido.");
			System.out.printf("Digite um valor positivo para calcularmos a tabuada: ");
			a = ler.nextInt();
		}

		System.out.println("Digite o valor inicial do intervalo da tabuada: ");
		b = ler.nextInt();

		System.out.println("Digite o valor final do intervalo da tabuada: ");
		c = ler.nextInt();

		while (c <= b) {
			System.out.println("O valor final do intervalo da tabuada (" + c
					+ ") deve ser maior do que o valor inicial (" + b + ").");
			System.out.println("Digite o valor final do intervalo da tabuada: ");
			c = ler.nextInt();
		}

		i = c;

		while (i >= b) {
			tab = a * i;
			System.out.println(tab);
			i = i - 1;
		}

	}

}

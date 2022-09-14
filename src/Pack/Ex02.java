import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, area;

		System.out.printf("Digite a aresta: ");
		a = ler.nextInt();

		area = a * a;

		System.out.printf("A área é %d", area);

		ler.close();

	}

}

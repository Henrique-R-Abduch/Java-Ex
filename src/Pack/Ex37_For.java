import java.util.Scanner;

public class Ex37_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, i, tab;
		String tecla;

		a = 1;
		i = 1;
		tecla = "x";

		for (i = 1; i <= 20; i++) {
			System.out.println("Tabuada do (" + i + ").");

			for (a = 1; a <= 10; a++) {
				tab = a * i;
				System.out.println(tab);
			}

			System.out.println("Pressione uma tecla para a pr�xima tabuada.");
			tecla = ler.nextLine();
		}
		System.out.println("Progama Encerrado.");
	}
}
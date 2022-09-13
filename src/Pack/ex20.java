
import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double p1, p2, media;

		media = 5;

		System.out.printf("Digite sua nota 1");
		p1 = ler.nextDouble();

		ler.close();

		p2 = ((3 * media) - p1) / 2;

		System.out.printf("Sua nota 2 deve ser: " + p2);
	}

}

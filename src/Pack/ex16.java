
import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double cateto1, cateto2, hipotenusa;

		System.out.printf("Digite o valor do cateto: ");
		cateto1 = ler.nextDouble();

		System.out.printf("Digite o valor do cateto: ");
		cateto2 = ler.nextDouble();

		ler.close();

		hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

		if (hipotenusa > cateto1 && hipotenusa > cateto2) {
			System.out.printf("É um triângulo retângulo");
		}

		else {
			System.out.printf("Não é um triângulo retângulo");
		}

	}

}

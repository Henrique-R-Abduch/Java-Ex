import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Double p1, p2, p3, p4, p5, som, troco, pag;

		System.out.printf("Informe o preço do primeiro produto: ");
		p1 = ler.nextDouble();

		System.out.printf("Informe o preço do segundo produto: ");
		p2 = ler.nextDouble();

		System.out.printf("Informe o preço do terceiro produto: ");
		p3 = ler.nextDouble();

		System.out.printf("Informe o preço do quarto produto: ");
		p4 = ler.nextDouble();

		System.out.printf("Informe o preço do quinto produto: ");
		p5 = ler.nextDouble();

		som = p1 + p2 + p3 + p4 + p5;

		System.out.printf("A soma deu %.2f, quanto deseja pagar? ", som);
		pag = ler.nextDouble();

		troco = pag - som;

		System.out.printf("O troco deu %.2f", troco);

		ler.close();
	}

}

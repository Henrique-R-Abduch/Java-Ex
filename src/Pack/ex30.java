
import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valor;
		int condicao;

		System.out.printf("Digite o preço do produto: ");
		valor = ler.nextDouble();

		System.out.printf("----- Condição de pagamento -----");
		System.out.printf("1 - À vista em dinheiro ou cheque, recebe 10% de desconto");
		System.out.printf("2 - À vista no cartão de crédito, recebe 15% de desconto");
		System.out.printf("3 - Em até 2x no cartão de crédito, preço normal");
		System.out.printf("4 - 3x no cartão de crédito, 20% de juros");
		System.out.printf("---------------------------------");

		System.out.printf("Digite a condição de pagamento: ");
		condicao = ler.nextInt();

		if (condicao == 1) {
			System.out.printf("Valor final: R$ %f", (valor - (valor * 0.1)));
		} else if (condicao == 2) {
			System.out.printf("Valor final: R$ %f", (valor - (valor * 0.15)));
		} else if (condicao == 3) {
			System.out.printf("Valor final: R$ %f", (valor / 2));
		} else if (condicao == 4) {
			System.out.printf("Valor final: R$ %f", (((valor * 0.2) + valor) / 3));
		} else {
			System.out.printf("Condição inválida");
		}
		ler.close();

	}

}

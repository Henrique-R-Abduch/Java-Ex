package exercicios;

import java.util.Scanner;

public class ex44f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double i, soma, n, maior, media;
		
		soma = 0;
		maior = 0;
		
		for (i=1; (i <= 10); i++) {
			System.out.println("Digite o " + (int) i + "º número positivo: ");
			n = ler.nextDouble();
			
			while (n < 0) {
				System.out.println("O número deve ser positivo!");
				System.out.println("Digite o " + (int) i + " número positivo: ");
				n = ler.nextDouble();
			}if (i == 1) {
				maior = n;
			}else if (n > maior) {
				maior = n;
			}
			
			soma = soma + n;
		}
		media = soma / (i - 1);
		
		System.out.println("O maior número é: " + maior);
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A média dos valores é: " + media);
	}
}
package Pack;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double cot, dol, result;
		
		System.out.printf("Informe a cotação: ");
		cot = ler.nextDouble();
		
		System.out.printf("Informe a quantidade de dólares: ");
		dol = ler.nextDouble();
		
		result = dol * cot;
		
		System.out.printf("R$%.2f", result);
		
		ler.close();
	}

}

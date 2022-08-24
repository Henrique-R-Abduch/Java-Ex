package Pack;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double c, f;
		
		System.out.printf("Informe a temperatura em Celsius: ");
		c = ler.nextDouble();
		
		f = (1.8 * c) + 32;
		
		System.out.printf("A temperatura em Fahrenheit é de %.2f", f);
		
		ler.close();

	}

}

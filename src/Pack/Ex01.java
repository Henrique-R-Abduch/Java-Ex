package Pack;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.printf("Digite a base: ");
		b = ler.nextInt();
				
		System.out.printf("Digite a aultura: ");
		a = ler.nextInt();
				
		area = b * a;
		
		System.out.printf("%d", area);
		
		ler.close();
	}

}

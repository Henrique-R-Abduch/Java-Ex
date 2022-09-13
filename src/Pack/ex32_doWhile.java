
import java.util.Scanner;

public class ex32_doWhile {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valor1, valor2;

        System.out.printf("Digite o primeiro valor: ");
        valor1 = ler.nextDouble();

        do {
            System.out.printf("Digite o segundo valor: ");
            valor2 = ler.nextDouble();
        } while (valor2 < valor1);

        System.out.print(valor1 + " " + valor2);

        ler.close();
    }
}

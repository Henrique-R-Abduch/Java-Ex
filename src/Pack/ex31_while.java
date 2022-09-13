
import java.util.Scanner;

public class ex31_while {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valor;

        System.out.printf("Digite o preço do produto: ");
        valor = ler.nextDouble();

        while (valor < 0) {
            System.out.printf("Digite o preço do produto: ");
            valor = ler.nextDouble();
        }

        System.out.print(valor);

        ler.close();
    }

}

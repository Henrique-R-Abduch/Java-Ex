
import java.util.Scanner;

public class ex31_doWhile {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criar uma rotina de entrada que aceite somente um valor positivo
        double valor;
        do {
            System.out.printf("Digite o preço do produto: ");
            valor = ler.nextDouble();
        } while (valor < 0);

        ler.close();

    }

}

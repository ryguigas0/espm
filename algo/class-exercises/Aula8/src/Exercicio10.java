import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n;

        do {
            System.out.println("Escreva um número positivo: ");
            n = kb.nextInt();
        } while (n < 0);

        double total = 0.0;
        for (int denominador = 1; denominador <= n; denominador++) {
            if (denominador % 2 != 0) {
                total += 1.0 / denominador;
            } else {
                total -= 1.0 / denominador;
            }
        }

        System.out.println("Resultado: " + total);

        kb.close();
    }
}

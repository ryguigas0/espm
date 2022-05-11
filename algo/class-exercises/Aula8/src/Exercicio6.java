import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        int n, counter = 1;

        Scanner kb = new Scanner(System.in);

        System.out.print("Insira o valor de n --> ");
        n = kb.nextInt();

        kb.close();

        double y = 0;

        while (counter <= n) {
            y += n / Math.sqrt(n);
            counter++;
        }

        System.out.println("Valor da equação --> " + y);
    }
}

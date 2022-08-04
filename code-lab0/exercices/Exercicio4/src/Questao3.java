import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite um número positivo de 1 a 1000000: ");
            n = kb.nextInt();
        } while (n < 1 || n > 1000000);

        kb.close();

        int sumDiv = 0;

        for (int num = 3; num <= n; num++) {
            for (int div = 1; div < num; div++) {
                if (num % div == 0) {
                    sumDiv += div;
                }
            }

            if (sumDiv == num) {
                System.out.println(num + " é um número perfeito!");
            }

            sumDiv = 0;
        }

    }
}

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        int a, b;

        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Insira um número inteiro --> ");
            a = kb.nextInt();

            System.out.print("Insira um número inteiro maior que " + a + " --> ");
            b = kb.nextInt();
        } while (a > b);

        kb.close();

        int diff = b - a, counter = 0, num = a;

        while (counter <= diff) {
            System.out.println(num);
            counter += 1;
            num += 1;
        }

    }
}

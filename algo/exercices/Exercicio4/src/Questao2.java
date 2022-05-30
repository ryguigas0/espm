import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite um número positivo: ");
            n = kb.nextInt();
        } while (n <= 0);

        kb.close();

        String output = "";

        for (int i = 1; i <= n; i++) {

            output = output + (i * 2) + " ";
        }

        System.out.println(output);
    }
}

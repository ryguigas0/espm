import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite um valor positivo: ");
            n = kb.nextInt();
        } while (n <= 0);

        kb.close();

        String asts = "*";

        for (int i = 0; i < n; i++) {
            System.out.println(asts);
            asts += "*";
        }

    }
}

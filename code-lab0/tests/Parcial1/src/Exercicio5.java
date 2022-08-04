import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int a, b, c, d;

        Scanner kb = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        a = kb.nextInt();

        System.out.print("Digite o segundo valor: ");
        b = kb.nextInt();

        System.out.print("Digite o terceiro valor: ");
        c = kb.nextInt();

        System.out.print("Digite o quarto valor: ");
        d = kb.nextInt();

        kb.close();

        if (a >= b && b >= c && c >= d) {
            System.out.println("Os números estão em ordem decrescente");
        } else if (d >= c && c >= b && b >= a) {
            System.out.println("Os números estão em ordem crescente");
        } else {
            System.out.println("Os números não estão ordenados");
        }

    }
}

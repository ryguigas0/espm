import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a, b, c;

        System.out.print("a --> ");
        a = kb.nextInt();

        System.out.print("b --> ");
        b = kb.nextInt();

        System.out.print("c --> ");
        c = kb.nextInt();

        kb.close();

        if (a < b && a < c) {
            // a é o menor
            if (b >= c) {
                // b é maior que c
                System.out.println("Ordem crescente: " + a + ", " + c + ", " + b);
            } else {
                System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
            }
        } else if (b < a && b < c) {
            // b é o menor
            if (a >= c) {
                // a é maior que c
                System.out.println("Ordem crescente: " + b + ", " + c + ", " + a);
            } else {
                System.out.println("Ordem crescente: " + b + ", " + a + ", " + c);
            }
        } else {
            // c é menor
            if (a >= b) {
                // a é maior que b
                System.out.println("Ordem crescente: " + c + ", " + b + ", " + a);
            } else {
                System.out.println("Ordem crescente: " + c + ", " + a + ", " + b);
            }
        }
    }
}

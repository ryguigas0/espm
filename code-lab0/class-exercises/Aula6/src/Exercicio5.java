import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a, b, c, aux;

        System.out.print("a --> ");
        a = kb.nextInt();

        System.out.print("b --> ");
        b = kb.nextInt();

        System.out.print("c --> ");
        c = kb.nextInt();

        kb.close();

        System.out.println("Ordem crescente: " + a + ", " + c + ", " + b);

        if (!(a < b)) {
            aux = b;
            b = a;
            a = aux;
        }
        System.out.println("Ordem crescente: " + a + ", " + c + ", " + b);

        if (!(a < c)) {
            aux = c;
            c = a;
            a = aux;
        }

        System.out.println("Ordem crescente: " + a + ", " + c + ", " + b);

        if (!(b < c)) {
            aux = b;
            b = c;
            c = aux;
        }

        // 12 15 21

        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
    }
}

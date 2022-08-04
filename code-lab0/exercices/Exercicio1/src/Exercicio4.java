import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double x, a, b, c, d, e, f, g, h, i, j;

        System.out.print("a --> ");
        a = kb.nextDouble();
        System.out.print("b --> ");
        b = kb.nextDouble();
        System.out.print("c --> ");
        c = kb.nextDouble();
        System.out.print("d --> ");
        d = kb.nextDouble();
        System.out.print("e --> ");
        e = kb.nextDouble();
        System.out.print("f --> ");
        f = kb.nextDouble();
        System.out.print("g --> ");
        g = kb.nextDouble();
        System.out.print("h --> ");
        h = kb.nextDouble();
        System.out.print("i --> ");
        i = kb.nextDouble();
        System.out.print("j --> ");
        j = kb.nextDouble();

        x = (((a - b) + (e + f)) / ((c - d) + (g + h))) * (i / j);

        System.out.println("x -->" + x);

        kb.close();
    }
}

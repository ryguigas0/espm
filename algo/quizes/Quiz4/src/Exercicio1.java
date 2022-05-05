import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        int a = 9, b = 7, c = 5, d = 3, e = 0, f = 0, g = 0;

        if (a > b && a > c && a > d) {
            e = a;
        } else if (b > a && b > c) {
            e = b;
        } else {
            e = c;
        }

        if (c < d) {
            f = c;
            c = d;
            d = f;
        }

        if (a > b || c > d) {
            g += 1;
        } else {
            f += 1;
        }

        if (b < c) {
            e = e + 2;
            f = f + 2;
        }

        if (d > a) {
            e = e + 3;
            f = f + 3;
        }

        g = g + 3;
    }
}

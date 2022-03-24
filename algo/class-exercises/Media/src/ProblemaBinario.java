import java.util.Scanner;

public class ProblemaBinario {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int bin, dec, m, c, d, u;

        System.out.print("Digite um número em binário de até quatro dígitos --> ");
        bin = kb.nextInt();

        m = bin / 1000;
        c = (bin % 1000) / 100;
        d = (bin % 100) / 10;
        u = bin % 10;

        System.out.println("m --> " + m + " c --> " + c + " d --> " +
                d + " u--> " + u);

        dec = (int) (m * Math.pow(2, 3) + c * Math.pow(2, 2) + d * Math.pow(2, 1) + u * Math.pow(2, 0));
        System.out.println(bin + " em decimal é --> " + dec);

        kb.close();
    }
}

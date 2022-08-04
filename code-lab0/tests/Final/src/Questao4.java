import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int tri, auxTri, quantDigitos = 0;
        double digito, num = 0;

        do {
            System.out.print("Digite o número em trinário --> ");
            tri = kb.nextInt();
        } while (tri <= 0);

        kb.close();

        while (tri - Math.pow(10, quantDigitos) >= 0) {
            quantDigitos++;
        }

        auxTri = tri;
        for (int i = 0; i < quantDigitos; i++) {
            digito = auxTri % 10;

            num += digito * Math.pow(3, i);

            auxTri /= 10;
        }

        System.out.println(tri + " em decimal é: " + String.format("%.0f", num));

    }
}

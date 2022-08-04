import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n;
        double a, b, c;

        do {
            System.out.print("Escreva quantos triângulos para classificar: ");
            n = kb.nextInt();
        } while (n < 0);

        for (int coun = 1; coun <= n; coun++) {
            System.out.print("Escreva o primeiro lado do triângulo: ");
            a = kb.nextDouble();

            System.out.print("Escreva o segundo lado do triângulo: ");
            b = kb.nextDouble();

            System.out.print("Escreva o terceiro lado do triângulo: ");
            c = kb.nextDouble();

            if (!(a < b + c && b < a + c && c < b + c)) {
                System.out.println("Não é um triângulo!");
            } else {
                if (a != b && b != c && a != c) {
                    System.out.println("Esse triângulo é escaleno!");
                } else if (a == b && b == c) {
                    System.out.println("Esse triângulo é equilátero");
                } else {
                    System.out.println("Esse triângulo é isósceles");
                }
            }

        }

        kb.close();
    }
}

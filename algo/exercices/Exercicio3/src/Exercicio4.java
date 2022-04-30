import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // O número tem no máximo quatro casas
        int num, milhares, centenas, dezenas, unidades;

        Scanner kb = new Scanner(System.in);

        num = kb.nextInt();

        kb.close();

        milhares = num / 1000;
        num -= milhares * 1000;

        centenas = num / 100;
        num -= centenas * 100;

        dezenas = num / 10;
        num -= dezenas * 10;

        unidades = num;

        if (milhares == unidades && dezenas == centenas) {
            System.out.println("Esse número é um palíndromo");
        } else {
            System.out.println("Esse número não é um palíndromo");

        }

    }
}

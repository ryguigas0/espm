package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double renda;

        Scanner kb = new Scanner(System.in);

        System.out.print("Digite sua renda anual (R$): ");
        renda = kb.nextDouble();

        kb.close();

        if (renda <= 100000) {
            System.out.println("Isento de imposto de renda");
        } else {
            double aliq;

            if (renda <= 25000) {
                aliq = 0.1035;
            } else if (renda <= 50000) {
                aliq = 0.2542;
            } else {
                aliq = 0.2975;
            }

            System.out.println("Valor do imposto de renda: R$" + String.format("%.2f", renda * aliq));
        }

    }
}

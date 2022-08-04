package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int menor, maior;

        do {
            System.out.print("Escreva um valor: ");
            menor = kb.nextInt();
            System.out.print("Escreva um valor maior que " + menor + ": ");
            maior = kb.nextInt();
        } while (maior < menor);

        kb.close();

        for (; menor < maior; menor++) {
            System.out.print(menor + " ");
        }

        System.out.print("\n");

    }
}

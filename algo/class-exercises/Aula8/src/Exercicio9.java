import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double total = 0.0;
        int quant;
        int tipoDesconto; // 1 é a vista e 2 é parcelado

        do {
            System.out.print("Escreva a quantidade de items ");
            quant = kb.nextInt();
        } while (quant <= 0);

        for (int count = 1; count <= quant; count++) {
            System.out.print("Digite o preço do item " + count + ": ");
            double preco = kb.nextDouble();
            total += preco;
        }

        do {
            System.out.println(
                    "Digite \n1 - Para pagar à vista\n2 - Para pagar parcelado em duas vezes");
            tipoDesconto = kb.nextInt();
        } while (tipoDesconto != 1 && tipoDesconto != 2);

        if (tipoDesconto == 1) {
            total *= 0.9;
        } else {
            total *= 1.155;
        }

        System.out.println("Total a pagar: R$" + String.format("%.2f", total));

        kb.close();
    }
}

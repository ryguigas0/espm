import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double custoFab, custoDistr, custoImpostos, custoConsumidor;

        Scanner kb = new Scanner(System.in);

        System.out.print("Insira o custo de fábrica (R$): ");
        custoFab = kb.nextDouble();

        kb.close();

        if (custoFab <= 12000) {
            custoDistr = custoFab * (5.0 / 100);
            custoImpostos = 0;
        } else if (custoFab <= 25000) {
            custoDistr = custoFab * (10.0 / 100);
            custoImpostos = custoFab * (15.0 / 100);
        } else {
            custoDistr = custoFab * (15.0 / 100);
            custoImpostos = custoFab * (20.0 / 100);
        }

        custoConsumidor = custoDistr + custoFab + custoImpostos;

        System.out.println("Custo do consumidor: R$" + String.format("%.2f", custoConsumidor));
    }
}

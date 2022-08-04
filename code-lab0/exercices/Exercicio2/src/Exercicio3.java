import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double salarioVendedor, valorVendas;

        System.out.print("Valor total das vendas do vendedor: ");
        valorVendas = kb.nextDouble();

        kb.close();

        if (valorVendas > 25000) {
            salarioVendedor = (valorVendas * 18.85) / 100;
        } else {
            salarioVendedor = (valorVendas * 17.5) / 100;
        }

        System.out.println("Valor do salário do vendedor: R$" + String.format("%.2f", salarioVendedor));

    }
}

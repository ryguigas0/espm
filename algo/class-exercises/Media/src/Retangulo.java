import java.util.Scanner;

/**
 * Criar um programa para imprimir no console a área e o perímetro de um
 * retângulo
 */
public class Retangulo {

    public static void main(String[] args) {
        // Declaração das variáveis
        Scanner kb = new Scanner(System.in);
        double base, altura, area, perimetro;

        // Entrada de dados
        System.out.println("Base: ");
        base = kb.nextDouble();
        System.out.println("Altura: ");
        altura = kb.nextDouble();

        // Processamento
        area = base * altura;
        perimetro = (base + altura) * 2;

        // Saída de dados
        System.out.println("Área: " + String.format("%.2f", area));
        System.out.println("Perimetro: " + String.format("%.2f", perimetro));

        kb.close();
    }
}
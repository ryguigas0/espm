import java.util.Scanner;

public class ProblemaJoao {
    public static void main(String[] args) {
        // Joao tem um tanque de combustível cilíndrico, que é pintado a cada 5 anos
        // Calcule a quantidade de latas de tinta e o custo para pintar o tanque,
        // sanbendo que:
        // 1 lata --- R$220 --- 5 L
        // 1 L -- 3m²
        // Área total de cilindro -> 2 * pi * r * (h + r), r é o raio do cilindro e h
        // é a altura do cilindro

        Scanner kb = new Scanner(System.in);

        double h, r;

        System.out.print("Altura do cilindro --> ");
        h = kb.nextDouble();

        System.out.print("Raio do cilindro --> ");
        r = kb.nextDouble();

        double area;
        area = 2 * Math.PI * (h + r) * r;
        // System.out.println("Área total do cilindro --> " + area);

        // 1lata --- 220R$ --- 5L --- 15m²
        double latas = area / 15;
        // System.out.println("Latas --> " + latas);

        double custo = latas * 220;
        // System.out.println("Custo --> " + custo);

        System.out.println("Para pintar " + String.format("%.4f", area) + "m² é necessário comprar "
                + String.format("%.4f", latas) + ", custando " + String.format("%.2f", custo) + "R$");

        kb.close();
    }
}

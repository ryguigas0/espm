import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int quantPontos;
        double x, y, maiorX = 0, maiorY = 0, dist, maiorDist = 0;

        do {
            System.out.print("Qual a quantidade de pontos que serão informados? --> ");
            quantPontos = kb.nextInt();
        } while (quantPontos <= 0);

        for (int i = 1; i <= quantPontos; i++) {
            System.out.println("\nPonto " + i + ":");

            System.out.print("x --> ");
            x = kb.nextDouble();
            System.out.print("y --> ");
            y = kb.nextDouble();

            dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            System.out.println("Distância até a origem --> " + String.format("%.4f", dist));

            if (maiorDist < dist) {
                maiorX = x;
                maiorY = y;
                maiorDist = dist;
            }
        }

        kb.close();

        System.out.println("O ponto mais distante tem coordenadas --> (" + maiorX + ", " + maiorY + ")");

    }

}

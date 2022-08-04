import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double x1, x2, y1, y2, dist1, dist2;

        System.out.print("Absissa do ponto 1 --> ");
        x1 = kb.nextDouble();

        System.out.print("Ordenada do ponto 1 --> ");
        y1 = kb.nextDouble();

        System.out.print("Absissa do ponto 2 --> ");
        x2 = kb.nextDouble();

        System.out.print("Ordenada do ponto 2 --> ");
        y2 = kb.nextDouble();

        dist1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        dist2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (dist1 > dist2) {
            System.out.println("O ponto 2 está mais próximo da origem");
        } else if (dist1 < dist2) {
            System.out.println("O ponto 1 está mais próximo da origem");
        } else {
            System.out.println("Os pontos estão a mesma distância da origem");
        }

        kb.close();
    }
}

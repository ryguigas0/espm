import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double t1, t2, p1, p2, medProva, medTrabalho, mediaFinal;

        System.out.print("Nota do trabalho 1 --> ");
        t1 = kb.nextDouble();

        System.out.print("Nota do trabalho 2 --> ");
        t2 = kb.nextDouble();

        System.out.print("Nota da prova 1 --> ");
        p1 = kb.nextDouble();

        System.out.print("Nota da prova 2 --> ");
        p2 = kb.nextDouble();

        medProva = (p1 + p2) / 2;
        medTrabalho = (t1 + t2) / 2;

        mediaFinal = medProva * 0.7 + medTrabalho * 0.3;

        System.out.println("Média final do aluno --> " + mediaFinal);

        if (mediaFinal >= 7) {
            System.out.println("Aluno está aprovado");
        } else {
            System.out.println("Aluno está reprovado");
        }

        kb.close();

    }
}

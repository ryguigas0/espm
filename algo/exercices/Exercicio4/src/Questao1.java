import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        int cand1 = 0, cand2 = 0, cand3 = 0, branco = 0, nulo = 0, n, voto;

        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Quantos votos para processar: ");
            n = kb.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            System.out.println("Para votar no candidato A, digite 1");
            System.out.println("Para votar no candidato B, digite 2");
            System.out.println("Para votar no candidato C, digite 3");
            System.out.println("Para votar branco, digite 0 ");
            System.out.println("Para votar nulo, digite -1");
            System.out.print("Digite o seu voto: ");

            voto = kb.nextInt();

            switch (voto) {
                case 1:
                    cand1++;
                    break;
                case 2:
                    cand2++;
                    break;
                case 3:
                    cand3++;
                    break;
                case 0:
                    branco++;
                    break;
                case -1:
                    nulo++;
                    break;

                default:
                    System.out.println("Digite um valor válido");
                    i--;
                    break;
            }

        }

        kb.close();

        System.out.println("Total de votos do candidato A: " + cand1);
        System.out.println("Total de votos do candidato B: " + cand2);
        System.out.println("Total de votos do candidato C: " + cand3);
        System.out.println("Total de votos em branco: " + branco);
        System.out.println("Total de votos nulos: " + nulo);

        int a = cand1, b = cand2, c = cand3, aux = 0;

        if (a > b) {
            aux = b;
            b = a;
            a = aux;
        }

        if (b > c) {
            aux = c;
            c = b;
            b = aux;
        }

        if (a > c) {
            aux = c;
            c = a;
            a = aux;
        }

        if (c == cand1) {
            System.out.println("Candidato 1 venceu!");
        } else if (c == cand2) {
            System.out.println("Candidato 2 venceu!");
        } else {
            System.out.println("Candidato 3 venceu!");
        }

    }
}

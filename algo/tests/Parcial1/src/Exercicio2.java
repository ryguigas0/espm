import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        int a, b, c, branco;

        Scanner kb = new Scanner(System.in);

        System.out.print("Votos da chapa A -> ");
        a = kb.nextInt();

        System.out.print("Votos da chapa B -> ");
        b = kb.nextInt();

        System.out.print("Votos da chapa C -> ");
        c = kb.nextInt();

        System.out.print("Votos em branco -> ");
        branco = kb.nextInt();

        kb.close();

        System.out.println("Total de votos -> " + (a + b + c + branco));

        int prim = a, seg = b, terc = c, aux;

        if (prim > seg) {
            aux = prim;
            prim = seg;
            seg = aux;
        }

        if (prim > terc) {
            aux = prim;
            prim = terc;
            terc = aux;
        }

        if (seg > terc) {
            aux = seg;
            seg = terc;
            terc = aux;
        }

        String vencedor, menosVotos;

        if (terc == a) {
            vencedor = "A";
        } else if (terc == b) {
            vencedor = "B";
        } else {
            vencedor = "C";
        }

        if (prim == a) {
            menosVotos = "A";
        } else if (prim == b) {
            menosVotos = "B";
        } else {
            menosVotos = "C";
        }

        System.out.println("Chapa vencedora -> " + vencedor);
        System.out.println("Chapa com menos votos -> " + menosVotos);

    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        int n1 = 8, n2 = 7, n3 = 2, m = n1;

        if (n2 > m) {
            m = n2;
        }

        if (n3 > m) {
            m = n3;
        }

        if (n1 == n2 && n2 == n3) {
            System.out.println("ruim");
        } else {
            System.out.println(m);
        }

    }
}

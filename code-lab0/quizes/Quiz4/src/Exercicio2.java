public class Exercicio2 {
    public static void main(String[] args) {
        boolean a = false, b = true;

        if (((a && b) || a) && ((!a && b) || !b)) {
            System.out.println("verdade");
        } else {
            System.out.println("falsa");
        }
    }
}

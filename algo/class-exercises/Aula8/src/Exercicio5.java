public class Exercicio5 {
    public static void main(String[] args) {

        double y = 0;

        int counter = 1;
        while (counter <= 20) {
            y += 1.0 / counter;
            counter++;
        }

        System.out.println("Valor da equação --> " + y);
    }
}

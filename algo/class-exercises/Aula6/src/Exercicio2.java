import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double altura;
        String nome;
        boolean masculino;
        double pesoIdeal;

        System.out.print("Qual o nome do paciente? ");
        nome = kb.nextLine();

        System.out.print("Qual o gênero do paciente é masculino? (true = sim false = não) ");
        masculino = kb.nextBoolean();

        System.out.print("Qual a altura do paciente? (em metros)");
        altura = kb.nextDouble();

        if (masculino) {
            pesoIdeal = 72.7 * altura - 58;
            System.out.print("O peso ideal do paciente " + nome + " é " + pesoIdeal);
        } else {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.print("O peso ideal da paciente " + nome + " é " + pesoIdeal);
        }

        kb.close();
    }
}

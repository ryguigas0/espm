import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        int n;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Indique quantos pacientes para calcular o IMC --> ");
            n = kb.nextInt();
        } while (n < 0);

        double peso, altura, imc;
        String nome;

        for (int i = 1; i <= n; i++) {

            kb.nextLine(); // Limpar o \n que sobrou depois de pegar o número de pacientes

            System.out.print("Digite o nome do paciente " + i + " --> ");
            nome = kb.nextLine();

            System.out.print("Digite o peso (em Kg) do paciente " + i + " --> ");
            peso = kb.nextDouble();

            System.out.print("Digite a altura (em metros) do paciente " + i + " --> ");
            altura = kb.nextDouble();

            imc = peso / (altura * altura);
            System.out.println(nome + ", seu IMC é: " + String.format("%4.3f", imc));

        }

        kb.close();
    }
}

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        int aulasSemanais;
        double valorAula, salarioBase, adicional, dsr, salarioMensal;

        System.out.print("Quantidade de aulas semanais do professor: ");
        aulasSemanais = kb.nextInt();

        System.out.print("Valor da aula do professor: ");
        valorAula = kb.nextDouble();

        kb.close();

        salarioBase = aulasSemanais * 4.5 * valorAula;
        adicional = salarioBase * 0.05;
        dsr = (salarioBase + adicional) / 6;

        salarioMensal = salarioBase + adicional + dsr;

        System.out.println("O salário mensal do professor é R$" + String.format("%.2f", salarioMensal));

    }
}
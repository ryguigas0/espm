import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        // Um caixa eletrônico tem notas de 100, 50, 20, 10, 5 e 1
        // Usuário fara um saque
        // Informe por vídeo a quantidade mínima de cada nota que cada usuário vai
        // receber

        Scanner kb = new Scanner(System.in);

        int saque;

        System.out.print("Valor para sacar --> ");
        saque = kb.nextInt();

        int notas100, notas50, notas20, notas10, notas5, notas1;

        notas100 = saque / 100;

        notas50 = (saque % 100) / 50;

        notas20 = ((saque % 100) % 50) / 20;

        notas10 = (((saque % 100) % 50) % 20) / 10;

        notas5 = ((((saque % 100) % 50) % 20) % 10) / 5;

        notas1 = ((((saque % 100) % 50) % 20) % 10) % 5;

        System.out.println("O usuário recerá " + notas1 + " nota(s) de 1R$, " + notas5 + " nota(s) de 5R$, " + notas10
                + " nota(s) de 10R$, " + notas20 + " nota(s) de 20R$, " + notas50 + " nota(s) de 50R$, " + notas100
                + " nota(s) de 100R$");

        kb.close();
    }
}

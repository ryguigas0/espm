import java.util.Scanner;

public class DigitoVerificador {
    public static void main(String[] args) {
        // Declaração das variáveis
        Scanner kb = new Scanner(System.in);
        int numero_conta, num_conta_invertido, digito_verificador, soma;

        // Entrada de dados
        System.out.print("num conta --> ");
        numero_conta = kb.nextInt();

        int dig1, dig2, dig3;

        dig1 = numero_conta / 100;
        dig2 = (numero_conta - 100 * dig1) / 10;
        dig3 = (numero_conta - 100 * dig1 - 10 * dig2);

        num_conta_invertido = dig3 * 100 + dig2 * 10 + dig1;
        // System.out.println("num conta invertido --> " + num_conta_invertido);

        soma = num_conta_invertido + numero_conta;
        // System.out.println("soma --> " + soma);

        dig1 = soma / 100;
        dig2 = (soma - 100 * dig1) / 10;
        dig3 = (soma - 100 * dig1 - 10 * dig2);

        digito_verificador = dig1 * 1 + dig2 * 2 + dig3 * 3;

        // System.out.println("digito verificador --> " + digito_verificador);
        dig1 = digito_verificador / 10;
        dig2 = digito_verificador - 10 * dig1;

        System.out.println("último digito do digito verificador --> " + dig2);

        kb.close();
    }
}

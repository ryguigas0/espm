import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double[] temperaturas = new double[7];

        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < temperaturas.length; i++) {
            String dia;

            switch (i) {
                case 0:
                    dia = "domingo";
                    break;
                case 1:
                    dia = "segunda";
                    break;
                case 2:
                    dia = "terça";
                    break;
                case 3:
                    dia = "quarta";
                    break;
                case 4:
                    dia = "quinta";
                    break;
                case 5:
                    dia = "sexta";
                    break;
                default:
                    dia = "sábado";
                    break;
            }

            System.out.print("Digite a temperatura (em °C) no(a) " + dia + " --> ");
            temperaturas[i] = kb.nextDouble();
        }

        kb.close();

        double soma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;

        System.out.println("Temperaturas acima da media (" + String.format("%.2f", media) + ")");

        for (int i = 0; i < temperaturas.length; i++) {
            double valor = temperaturas[i];

            if (valor > media) {
                String dia;

                switch (i) {
                    case 0:
                        dia = "domingo";
                        break;
                    case 1:
                        dia = "segunda";
                        break;
                    case 2:
                        dia = "terça";
                        break;
                    case 3:
                        dia = "quarta";
                        break;
                    case 4:
                        dia = "quinta";
                        break;
                    case 5:
                        dia = "sexta";
                        break;
                    default:
                        dia = "sábado";
                        break;
                }
                System.out.println(dia + " --> " + String.format("%.2f", valor));
            }
        }
    }
}

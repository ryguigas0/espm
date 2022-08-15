import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Random r = new Random();

        Scanner kb = new Scanner(System.in);

        System.out.print("Quantos números diferentes devem ser gerados? ");
        int qtd = kb.nextInt();

        kb.close();

        int[] nums = new int[qtd];

        for (int i = 0; i < nums.length; i++) {
            int novoNum = r.nextInt(qtd) + 1;
            boolean temAntes = false;

            do {
                for (int j = 0; j < i; j++) {
                    if (nums[j] == novoNum) {
                        temAntes = true;
                        break;
                    } else {
                        temAntes = false;
                    }
                }

                if (temAntes) {
                    novoNum = r.nextInt(qtd) + 1;
                }
            } while (temAntes);

            nums[i] = novoNum;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}

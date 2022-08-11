import java.util.Random;

public class Exercicio7 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            int novoNum = r.nextInt(10) + 1;
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
                    novoNum = r.nextInt(10) + 1;
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

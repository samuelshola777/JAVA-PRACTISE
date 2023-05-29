package Python;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        int[] freq = new int[7];
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < 500_000; i++) {
            int num = 1 + secureRandom.nextInt(6);
            freq[num]++;
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.printf("%-2d %-5d%n", i, freq[i]);
        }
    }
}

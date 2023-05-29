package Practice;

import java.security.SecureRandom;

public class SixDIes {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int sam = 1 ;sam >= 30 ; sam++){




            int goat = 1+ random.nextInt(6);

            System.out.println(goat);

        }


    }

}

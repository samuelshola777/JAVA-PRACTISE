package Chapter6;

import java.security.SecureRandom;

public class RandomInterger {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        for (int counter = 1 ; counter <=30 ; counter++){

            int face = 1+ random.nextInt(6);

            System.out.print(face);

            if (counter % 5 == 0){
                System.out.println();
            }
        }

    }
}

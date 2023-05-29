package Chapter6;

import java.security.SecureRandom;

public class RandomNumberLoop {
    public static void main(String[] args) {

         SecureRandom random = new SecureRandom();

            for (int i = 0; i < 20; i++) {
                int changeNumber  = 1+ random.nextInt(6);

                    System.out.printf("%2d ",changeNumber);
                        if (i %  5 == 0){
                            System.out.println();
                }

            }



    }
}

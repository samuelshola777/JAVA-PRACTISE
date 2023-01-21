package ClassWork;

import java.util.Scanner;

public class ShoppingMailTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ShoppingMall supermarket = new ShoppingMall();
        while (true) {
            System.out.println("welcome to the shoping mall  \n\n" +
                    "we sell boxers for 250\n" +
                    "enter 1 for boxers\n\n" +
                    "we sell gString for 90 \n" +
                    "enter 2 for gString\n\n" +
                    "we sell katapot for 30\n" +
                    "press 3 for katapoy");
            int cart = input.nextInt();

            switch (cart) {
                case 1:
                    System.out.println("how many boxers are you purchasing ");
                    int boxer = input.nextInt();
                    supermarket.setBoxer(boxer);
                    System.out.println(boxer);

                    System.out.println(supermarket.getBoxer());
                    break;
                case 2:
                    System.out.println("how many boxer are you purchasing");
                    int Gstring = input.nextInt();
                    supermarket.setGstring(Gstring);
                    break;
                case 3:
                    System.out.println(" how many katapot are you purchasing");
                    int katapot = input.nextInt();

            }

        }
    }
}

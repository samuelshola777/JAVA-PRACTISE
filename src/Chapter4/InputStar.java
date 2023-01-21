package Chapter4;

public class InputStar {
    public static void main(String[] args) {
        System.out.println("plese enter the the number of star you want");
        int star = MilePerGarlon2.tryAndCatch();

        for (int i = 1; i < star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}

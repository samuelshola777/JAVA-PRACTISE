package printLoopLesson;

public class DecreasingTraingle {
    public static void main(String[] args) {


        for (int i = 1; i <= 10 ; i++) {
            System.out.print("  "+i+" ");
            for (int j = i; j <= 10 ; j++) {
                System.out.print( j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 10; i >= 1 ; i--) {
            System.out.print("  "+i+" ");
            for (int j = i; j >= 1 ; j--) {
                System.out.print( j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1 ; i <= 10 ; i++) {
            System.out.print("  "+i+" ");
            for (int j = i; j >= 1 ; j--) {
                System.out.print( j+" ");
            }
            System.out.println();
        }



    }
}

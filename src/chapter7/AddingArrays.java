package chapter7;

public class AddingArrays {
    public static void main(String[] args) {


        int [] array = {87, 68, 94, 100, 83, 87, 78, 85, 91, 76, 87};

        int toatl = 0 ;

        for (int counter = 0 ; counter < array.length; counter++){
             toatl += array[counter];
            System.out.printf("your total is equal to : %d%n", toatl);
            System.out.println();
            System.out.println();
        }
        System.out.printf("your total is equal to : %d%n", toatl);
    }
}

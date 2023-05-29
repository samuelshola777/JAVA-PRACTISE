package Chapter4;

public class SecondGreatestNumber {
    public static void main(String[] args) {


        System.out.println("please enter how many number to you wanna input ");
        int length = MilePerGarlon2.tryAndCatch();


        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("please enter numbers  "+i);
            array[i] = MilePerGarlon2.tryAndCatch();
        }

        int large = array[0];
        int sLarge = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > large){
                large = array[i];
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sLarge){
                sLarge = array[i];
            }
        }


        System.out.println("the first largest is " + large);
        System.out.println("the second largest is "+ sLarge);
    }
}

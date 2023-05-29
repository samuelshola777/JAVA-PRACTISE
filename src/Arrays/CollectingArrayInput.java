package Arrays;

import java.util.Scanner;

public class CollectingArrayInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       // int[] myArray = new int[0];

            System.out.println("please enter size of array length\r");
                 int length = input.nextInt();

                    int[] myArray = new int[length];

                        System.out.println("please enter values to be stored in the array index \r");

        for (int counter = 0; counter < length ; counter++){
            myArray[counter] = input.nextInt();

        }
                for (int counter = 0 ; counter < length; counter++){
                    System.out.println("index  "+counter+"  value "+ myArray[counter]);

        }
                int totola= 0;
        for (int i = 0; i < myArray.length; i++) {
            totola += myArray[i];
        }


    }

}

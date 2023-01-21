package Practice;

import java.util.Scanner;

public class CollectingInputArray {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("how many spaces are storing");
        int element = input.nextInt();

        int [] justArray = new int[element];
        System.out.println("value in the array ");


       for (int counter = 0; counter < justArray.length; counter++){
           justArray[counter] = input.nextInt();
       }

        for (int counter = 0; counter < justArray.length; counter++){
            System.out.println("new array  "+justArray[counter]);

        }

        for (int sort = 0 ; sort < justArray.length; sort++){
            for (int sort2 = 0 ; sort2 < sort ; sort++){
                int arranging = 0;

                if (justArray[sort] > justArray[sort2]){

                    arranging = justArray[sort];
                    justArray[sort] = justArray[sort2];
                    justArray[sort2] = arranging;
                }
            }
        }
        for (int counter = 0 ; counter < justArray.length; counter++){

                    System.out.println(justArray[counter]);
                }

    }
}

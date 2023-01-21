package Arrays;

import java.util.Scanner;

public class ChallengSortingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please help input length of array\r");

        int length = input.nextInt();

        int [] myArrray = new int[length];
        System.out.println("please enter value of the array\r");
        for (int counter = 0; counter < myArrray.length; counter++){
            myArrray[counter] = input.nextInt();



        }
        int receivingValue = myArrray[0];

        for (int counter1 = 0 ; counter1 < myArrray.length; counter1++){
            for (int i = 1; i < myArrray.length-1; i++) {
                if (myArrray[counter1] < myArrray[i+1]){
                    receivingValue = myArrray[counter1];
                    myArrray[counter1] = myArrray[i];
                    myArrray[i] = receivingValue;

                }


            }

            }
//        System.out.print(Arrays.toString(myArrray));
       for (int i = 0; i < myArrray.length; i++) {
          System.out.println();
        }
        }

    }



package Practice;

import java.util.Scanner;

public class PractiseArray {
    public static void main(String[] args) {

        int [] myArray = new int[10];

for (int counter = 0 ; counter < myArray.length ; counter++){
    myArray[counter] = counter *10 ;

}

        System.out.println(myArray[0]);
System.out.println(myArray[1]);
System.out.println(myArray[2]);
System.out.println(myArray[3]);
System.out.println(myArray[4]);
System.out.println(myArray[5]);
System.out.println(myArray[6]);
System.out.println(myArray[7]);
System.out.println(myArray[8]);
System.out.println(myArray[9]);

printArray(myArray);


        Scanner input = new Scanner(System.in);



        {

        }

    }
    public static void printArray(int [] Array) {
        for (int counter1 = 0; counter1 < Array.length; counter1++) {
            System.out.println("counter adding up " + counter1 + " array adding up " +
                    "" + Array[counter1]);

        }
    }
}

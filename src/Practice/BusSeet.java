package Practice;

import java.util.Scanner;

public class BusSeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean [] seat = new  boolean [10];

        do {
            for (int i = 0; i < seat.length ; i++){
            System.out.println("welcome to samuel shola transportaion\n" +
                    "for first class press 1\n" +
                    "for economy press 2\n");
            int responce = input.nextInt();

            if (responce  == 1){
                for (int j = 0; j < 5 ; j++) {
                    if (seat[j] == false){
                        seat[j] = true;
                        System.out.printf("seat number  %d has been assigned too you \n", j+1);
                        break;


                    }


                }
                System.out.println(seat[0]);
                System.out.println(seat[1]);
                System.out.println(seat[2]);
                System.out.println(seat[3]);
                System.out.println(seat[4]);

            }
            else {
                if (responce == 2){
                    for (int time2 = 4 ; time2 < 9; time2++){
                        if (seat[time2] == false){
                            seat[time2] = true;
                            System.out.printf(" seat number %d has been saved for you at the Economy see",time2+1);
                            break;
                        }


                    }

                }
                System.out.println(seat[5]);
                System.out.println(seat[6]);
                System.out.println(seat[7]);
                System.out.println(seat[8]);
                System.out.println(seat[9]);

            }

        }
            System.out.println(seat[1]);



        }while (true);




    }
}

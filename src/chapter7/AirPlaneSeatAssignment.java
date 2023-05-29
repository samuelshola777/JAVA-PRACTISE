package chapter7;

import java.util.Scanner;

public class AirPlaneSeatAssignment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean[] seatReservation = new boolean[10];
        do {

            System.out.println("hi\nWELCOME TO SAMUEL SHOLA AIRPLANE SEET ASSIGNMENT\n\n" +
                    "press 1 for first class seat\n" +
                    "press 2 for economy seat");
            int seat = input.nextInt();

            if (seat == 1) {
                int assigned = -1;

                for (int i = 0; i < 5; i++) {
                    if (!seatReservation[i]) {
                        seatReservation[i] = true;
                        assigned = i + 1;
                        break;
                    }
                }


            }


        } while (true);

}
    }



package Chapter4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MilePerGarlon2 {
    private int mileDriven;
    private int gallonPerTrip;

    private int numberOfTrip;

    public int getMileDriven() {
        return mileDriven;
    }

    public void setMileDriven(int mileDriven) {
        this.mileDriven = mileDriven;
    }

    public int getGallonPerTrip() {
        return gallonPerTrip;
    }

    public void setGallonPerTrip(int gallonPerTrip) {
        this.gallonPerTrip = gallonPerTrip;
    }




    public int getNumberOfTrip() {
        return numberOfTrip;
    }

    public void setNumberOfTrip(int numberOfTrip) {
        this.numberOfTrip = numberOfTrip;
    }

    public static int tryAndCatch(){
        int number = 0;
        Scanner scanner= new Scanner(System.in);
        while (true) {
            try {
                number = Integer.parseInt(scanner.next());
                break;
            } catch (InputMismatchException smile) {
                System.out.println("you have entered a wrong input please try again \n" +
                        "enter number");
            }catch (NumberFormatException wunmi){
                System.out.println("you have entered a wrong input please try again \n" +
                        "enter number ");
            }
        }

        return number;
    }

public int fullTank(int responce ) {
    int tankfull = 0;
    int gallon;
    if (responce == 1) {

        while (tankfull < 10) {
            System.out.println("please enter gallon ," +
                    "\n please remember 10 gallon make's a tankfull ");
            while (true) {
             gallon   = MilePerGarlon2.tryAndCatch();

                if (gallon > 10) {
                    System.out.println("please remember 10 gallon makes a tankfull\n" +
                            " you can only enter gallon less than or equals to 10");

                } else {
                    break;
                }
            }
            tankfull += gallon;
            if (tankfull + gallon > 10){
                tankfull = 10;
            }

                System.out.println("we now hAve  " + tankfull + " gallons");
                if (tankfull == 10) {
                    System.out.println("we now have a full tank and we're ready to go ");
                    break;
                }


            }
        }



    return tankfull;
    }
    public int mileCalculator(int mile, int fullTank){
        int mileDrive = 0;
        while (true) {
            if (mile >= 5) {
                fullTank --;
            mileDrive += 5;
            }
            System.out.println(mileDrive+"   the heavy metal");
            if (fullTank == 0) {
                break;
            }
        }

        return  mileDrive;
    }
}



package Chapter4;

import java.util.Scanner;

public class TaxDetermine {
    public String getCitizenName() {
        return CitizenName;
    }

    public void setCitizenName(String citizenName) {
        CitizenName = citizenName;
    }

    public int getEarning() {
        return earning;
    }

    public void setEarning(int earning) {
        this.earning = earning;
    }

    private String CitizenName;
    private int earning;

    public static void TaxCalculator(TaxDetermine citien1){

        Scanner scanner = new Scanner(System.in);

        TaxDetermine citizen = new TaxDetermine();

        System.out.println("please enter  name of  citizen ");
        String name = scanner.nextLine();
        citizen.setCitizenName(name);

        System.out.println("please enter citizen yearly  earning ");
        citizen.setEarning(scanner.nextInt());

         double fifteenPercent = (15 * (citizen.getEarning()) / 100);
         double twentyPercent = (20 * (citizen.getEarning()) / 100);

        if (citizen.getEarning() <= 30000){
            System.out.println("your total tax for the year is "+ fifteenPercent+"\n");
        }
         if (citizen.getEarning() > 30000){
            System.out.println("your total tax for the year is "+ twentyPercent+" \n");
        }


    }

    public static void main(String[] args) {
        TaxDetermine citizen1 = new TaxDetermine();
        TaxDetermine citizen2 = new TaxDetermine();
        TaxDetermine citizen3 = new TaxDetermine();
        while (true) {
        System.out.println("welcome to the tax calculating machine \n" +
                "for citizen 1 enter 1\n" +
                "for citizen 2  enter 2\n" +
                "for citizen 3 enter  3 \n" +
                "enter 900 to end the program");
        int citien = MilePerGarlon2.tryAndCatch();

            switch (citien) {
                case 1 -> TaxCalculator(citizen1);
                case 2 -> TaxCalculator(citizen2);
                case 3 -> TaxCalculator(citizen3);
            }
            if (citien > 3 || citien == 900){
                break;
            }
        }


    }
}

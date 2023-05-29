package Chapter6;

import java.util.Scanner;

public class ParkingSpaceCalculator {

    double parkingSpaceFee = 2.00;
    double parkingSpaceFeeForMoreThan3Hour = 2.00 + 00.50;

    double fullDayPark = 10.00;

    public Tickets parkingCalculateCharges( int hour, String plateNumber){
   double fee = 0;
   double oneDayPlus = 0;
   int remove24 = 0;
        Tickets tickets = new Tickets();
       if (hour <= 3){
       fee =  hour * parkingSpaceFee;
       }
    if (hour >= 3 || hour < 24){
        fee = hour * parkingSpaceFeeForMoreThan3Hour;
    }
    if (hour >= 24) {
        remove24 = hour - 24;
        if (remove24 > 3) {
            oneDayPlus = remove24 * parkingSpaceFeeForMoreThan3Hour;
            fee = oneDayPlus + fullDayPark;
        }
   }
    tickets.setCharges(parkingSpaceFee);
    tickets.setHour(hour);
    tickets.setTotalCost(fee);
    tickets.setCarPlateNumber(plateNumber);
    return tickets;
    }
    class Tickets{
        public int getHour() {
            return hour;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public double getCharges() {
            return charges;
        }

        public void setCharges(double charges) {
            this.charges = charges;
        }

        public String getCarPlateNumber() {
            return carPlateNumber;
        }

        public void setCarPlateNumber(String carPlateNumber) {
            this.carPlateNumber = carPlateNumber;
        }

        public double getTotalCost() {
            return totalCost;
        }

        public void setTotalCost(double totalCost) {
            this.totalCost = totalCost;
        }

        //        public Tickets(int hour, int charges, String carPlateNumber, int totalCost) {
//            this.hour = hour;
//            this.charges = charges;
//            this.carPlateNumber = carPlateNumber;
//            this.totalCost = totalCost;
//        }

        private int hour;
        private double  charges;
        private String carPlateNumber;
        private double totalCost;

        public String toString() {

            return String.format("""
                    ||==========================================||\n
                    || car plate Number  ()->   %s          ||\n
                    --------------------------------------------||\n
                    || parking charges  ()->   %f          ||\n
                    --------------------------------------------||\n
                    || parking hour      ()->  %d            ||\n
                    --------------------------------------------||\n
                    || total charges =   %f               ||\n
                    ============================================||\n
                    """,carPlateNumber,charges,hour,totalCost);

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        ParkingSpaceCalculator spaceCalculator = new ParkingSpaceCalculator();

        while (true) {
            System.out.println("""
        welcome to parking space calculator ---->\n
          <<------ how to use use the app ---->>   \n
          
        1)  enter the plate number of the specific vehicle you  wanna calculate parking space for \n
          
        2)  then you enter the number of hour the vehicle parked for and the System generates a receipt for you                       
                    """);

            System.out.println("please enter the plate number of k the vehicle");
            String plateNumber = scanner.next();

            System.out.println("please enter how many hours the vehicle parked for ");
            int hour = scanner1.nextInt();

            System.out.println(spaceCalculator.parkingCalculateCharges(hour, plateNumber));


            System.out.println("do you want to continue calculating parking space charges \n" +
                    "enter q if you want to continue\n" +
                    "enter any other thing to quit calculator");
                String responce = scanner.next();
                if (responce.equalsIgnoreCase("q")) continue;
                break;

        }
    }
    
}

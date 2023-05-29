package chapter3;

import java.util.Scanner;

public class ModifyPetrolPurchase {

   private  String location;
   private String petrolType;
   private int literPurchase;
   private double pricePerLiter;

   private double percentageDiscount;


   public void setLocation(String location){
       this.location = location;
   }

   public void setPetrolType(String petrolType){
       this.petrolType = petrolType;
   }
   public void setLiterPurchase(int liter){

       this.literPurchase = liter;
   }
   public void setPricePerLiter (double amountPerLiter){
       this.pricePerLiter = amountPerLiter;
   }
   public void setPercentageDiscount(double discount){
       this.percentageDiscount = discount;
   }

   public  ModifyPetrolPurchase (String location ,String petrolType, int liter,double amountPerLiter, double discount){

       this.location = location;
       this.petrolType = petrolType;
       this.literPurchase = liter;
       this.pricePerLiter = amountPerLiter;
       this.percentageDiscount = discount;

   }

   public String getLocation(){
       return location;
   }
   public String getPetrolType(){
       return petrolType;
   }
   public int getLiterPurchase(){
       return literPurchase;
   }
   public double getPricePerLiter(){
       return pricePerLiter;
   }
   public  double getPercentageDiscount(){
       return percentageDiscount;
   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);

       ModifyPetrolPurchase fuelCalculator = new ModifyPetrolPurchase("totalIkeja",
               "petrol"
               ,10,
               230,
               0.23);
        System.out.println(" hi\n hope you're having a great day\n\n" +
                "WELCOME TO FUEL CALCULATOR\n" +
                "here is the recent transaction we've done in the past\n"+
                        "<<---------------------------------------------->>\n"+
                "***  the location of the last fueling station "+fuelCalculator.getLocation()+"\n"+
                "**** the fuel type was actually "+fuelCalculator.petrolType+"\n"+
                "**** and "+fuelCalculator.getLiterPurchase()+" was purchased"+"\n"+
                "******  and petrol was purchased at "+fuelCalculator.getLiterPurchase()+" per liter\n"+
                "***** and there was a discount of "+fuelCalculator.getPercentageDiscount()+"\n"+
                "<<------------------------------------------------------------------>>\n\n"+"" +
                "TOGETHER LET'S CALCULATE YOUR FUELING EXPENSE TOGETHER\n" +
                "enter any number to proceed");
        int proceed = input.nextInt();

        System.out.println("please enter location where you got the fuel from");
        fuelCalculator.setLocation(string.nextLine());

        System.out.println();

        System.out.println("please enter the type of fuel you got ");
        fuelCalculator.setPetrolType(string.nextLine());
        System.out.println();

        System.out.println("please enter how many liter you got");
        int liter = input.nextInt();
        fuelCalculator.setLiterPurchase(liter);
        System.out.println();

        System.out.println("please enter amount a liter was sold to you");
        int amountPerLiter = input.nextInt();
        fuelCalculator.setPricePerLiter(amountPerLiter);
        System.out.println();

        System.out.println("how many percent discount were you given ");
        double discount = input.nextDouble();

        System.out.println();

        double totalPhurchase = ( (amountPerLiter * liter) - discount );


        System.out.println("the location of the filling station is  " +fuelCalculator.getLocation()+"\n" +
                                    "the type of fuel you got at "+fuelCalculator.getLocation()+" is "+fuelCalculator.getPetrolType()+"\n" +
                                    "and a  liter cast "+fuelCalculator.getPricePerLiter()+" per liter \n" +
                                    "and you got "+fuelCalculator.getLiterPurchase()+" at the rate of  "+fuelCalculator.getPricePerLiter()+"\n" +
                                    "and you were given the discount of "+fuelCalculator.getPercentageDiscount()+"\n so the total cost of your fueling is \n"+
                            "   "+totalPhurchase);

    }
    public static void totalFuelCost(){

    }
}

package chapter3;

public class PetrolTest {
    public static void main(String[] args) {
        PetrolPurchase mypetrol = new PetrolPurchase("lekki"
                ,"whitePetrol",100,10,5);


        System.out.println(mypetrol.petrolTransprice());

    }


    public static class Car {

     private String model;
     private  String year;
     private double price;

     public Car(String model, String year, double price){
         this.model = model ;
         this.model = model ;
         this.price = price;
     }

     public void setModel(String model){
         this.model = model;
     }
     public  void setYear (String year){
         this.year = year;
     }
     public void setPrice(double price){
         this.price = price;
     }

     public String getModel(){
         return model;
     }
     public String getYear(){
         return year;
     }
     public double getPrice(){
         return price;
     }
    }
}

package Practice;

public class Iphone {
    private  String color;
   private static double price;

    public Iphone(String color, double price) {
        this.color = color;
        Iphone.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

     public static double setPrice(double price )
     {

        Iphone.price = price;
         return price;
     }
    public String getColor(){
        return color;
    }
   public static double getPrice(){

         return price;
    }
}

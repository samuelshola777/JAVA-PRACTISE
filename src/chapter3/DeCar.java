package chapter3;

public class DeCar {
    private  String model;
    private String year;
    private double price;

    public DeCar(String model, String year, double price){
        this.model = model;

        this.year = year;

        if(price > 0.0) {
            this.price = price;
        }
    }
    public  void  setModel(String mode){
        this.model = mode;
    }
    public void  setYear(String year){
        this.year = year;
    }
    public void setPrice(double price){
        if(price > 0.0) {
            this.price = price;
        }
    }

    public String getModel(){
        return  model;
    }
    public  String getYear(){
        return year;
    }
    public  double getPrice(){
        return  price;
    }
    public void applyDiscount(double percentageDiscount){
        double discount = percentageDiscount / 100 * price;
        price = price - discount;
    }
    public void  applyExraDiscount(double extraDiscount){
        double Extra = extraDiscount / 100 * price;
    }
}

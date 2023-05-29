package chapter3;

public class ModifyCarClass {
    private String model;
    private String year;
    private  int price;

    public void setModel(String model){
        this.model = model;

    }
    public void setYear(String year){
        this.year = year;
    }
    private void setPrice(int price){
        this.price = price;
    }

   public String getModel(){
        return model;
   }

   public String getYear(){
        return year;
   }
   public int getPrice(){
        if (price > 0){
            price = price;
        }
        return price;
   }
   public ModifyCarClass(String model, String year, int price){
        this.model = model;
        this.year = year;
        this. price = price;
   }

}

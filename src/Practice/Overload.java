package Practice;

public class Overload {

    public String buypizza(String where){
        return "i bought pizza at " + where;
    }
    public String buypizza(){
        return "i bought pizza at just a random place!";
    }
    public void buyPizza(String where, int price){
        System.out.printf("i bought at %d", where , price);
    }






}

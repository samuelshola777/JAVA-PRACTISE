package Chapter6;

public class MethodOverLoad {

    public int addNumber(int number, int number1){
        return number + number1;
    }

    public String addNumber( String name, int Snumber){
        return "my name is samuel shola " + Snumber;
    }
    public double addNumber(double ping, int Mnumber){
        return ping + Mnumber;
    }
    public double addNumber(int Bnumber, double goat){
        return Bnumber + goat;
    }

    public static void main(String[] args) {
MethodOverLoad methodOverLoad = new MethodOverLoad();

        System.out.println(methodOverLoad.addNumber("samuel shola  ",700));

    }

}

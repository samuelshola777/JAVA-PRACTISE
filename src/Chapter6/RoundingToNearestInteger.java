package Chapter6;

public class RoundingToNearestInteger {

    public static void roundToNearestToInteger(double number){
        System.out.println(Math.floor(number)+ 0.5);
    }

    public static void main(String[] args) {
        roundToNearestToInteger(6.09);
    }

}

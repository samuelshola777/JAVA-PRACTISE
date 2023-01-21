package chapter3;

public class DEcarTest {
    public static void main(String[] args) {

        DeCar car1 = new DeCar("ford","2016", 26000000);
        DeCar car2 = new DeCar("chevrolet","2018", 26000000);

      car1.applyDiscount(5.00);
      car1.applyDiscount(7.00);
        System.out.println(car1.getPrice());
       // System.out.println(car2.getPrice());
    }
}
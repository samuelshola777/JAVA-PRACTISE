package chapter3;

public class ModifyCarTest {
    public static void main(String[] args) {
        ModifyCarClass car1 = new ModifyCarClass("ford ecoline", "2019", 2300500);
        ModifyCarClass car2 = new ModifyCarClass("toyota sienna", "2019", 50000000);

        double discount1 = 0.5;
        double discount2 = 0.7;

        double disPrice1 = car1.getPrice() - discount1;
        System.out.println("for car1 one the model is " + car1.getModel() + "\n" +
                "and the vehicle was produce in year " + car1.getYear()+"\n" +
                "and it worth " + car1.getPrice()+"\n" +
                "but there was a discount of 5% so the total cost is " + disPrice1);

        System.out.println();
    double disPrice2 = car2.getPrice() - discount2;
        System.out.println("for car2 one the model is " + car2.getModel() + "\n" +
                "and the vehicle was produce in year " + car2.getYear()+"\n" +
                "and it worth " + car2.getPrice()+"\n" +
                "but there was a discount of 7% so the total cost is " + disPrice2);
    }



    }


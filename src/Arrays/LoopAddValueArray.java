package Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopAddValueArray {

private static int price;

public  LoopAddValueArray(int price){
    if (price > 0){
        LoopAddValueArray.price = price;
    }
}

public static void setPrice(int price){
    if (price > 0){
        LoopAddValueArray.price = price;
    }

}
public static int getPrice(){
    return price;
}


 public static double removePercentage(int price){
double remove = 0.05*price;

     return price - remove;
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      //  LoopAddValueArray try = new LoopAddValueArray(16500);
        while (true) {
            try {
                System.out.println("please enter amount  ");
                 String enterPrice = input.nextLine();
                setPrice(Integer.parseInt(enterPrice));
                break;

            }
            catch (NumberFormatException num) {
                System.out.println("you entered a incorrect value");
            }
        }
    // removePercentage(getPrice());
    System.out.println(" normal price =   " + getPrice());
    System.out.println("discounted price =   " + removePercentage(getPrice()));

    }

}

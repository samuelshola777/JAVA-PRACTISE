package task.chapter5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaxCalculator {
static Scanner scanner = new Scanner(System.in);
static Scanner scanner1 = new Scanner(System.in);
    public static void taxCalculator(){
        double totalprices = 0.0;
        int tNOP = 0;
        double totalTaxes = 0.0;

        HashMap< String, Double> taskDataBase = new HashMap<>();
        HashMap< String, Double> taskPersentage = new HashMap<>();

while (true) {

    System.out.println(" enter product ");
    String product = scanner.nextLine();
    System.out.println("enter product amount");
    double price = scanner1.nextDouble();
    tNOP++;
    if (price > 500) {
        double taxpercentage = 0.50 * price;
//        price -= taxpercentage;
    }
    double taxPercentage = 0.23 * price;
//    price -= taxPercentage;
    totalprices += price;
    totalTaxes += taxPercentage;
    taskDataBase.put(product, price);
    taskPersentage.put(product, taxPercentage);
    System.out.println("for ()-> "+product + "  at the price of " + price+"  your tax charge is " + taxPercentage);
    System.out.println("do you want to perform another transaction ?\n" +
            "enter yes to continue press anything to cancel ");
    String control = scanner.nextLine();
    if (control.equalsIgnoreCase("yes")) continue;
    break;

}
System.out.println("      product       cost of product          Tax ");


for (Map.Entry<String, Double> entry : taskDataBase.entrySet()){
    String product = entry.getKey();
    double price = entry.getValue();
    double tax = taskPersentage.get(product);
System.out.println(":   "+product+"           "+price+"                "+tax);
}
        System.out.println("<------------------------------------------------->");
System.out.println(tNOP+"                  "+totalprices+"           "+totalTaxes);
    }

    public static void main(String[] args) {

        taxCalculator();
    }

}

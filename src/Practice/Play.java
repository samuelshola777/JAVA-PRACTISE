package Practice;
import java.security.SecureRandom;
import java.util.Scanner;
public class Play  {

    public static int multiple(int num1, int num2){
        int sum = num1 * num2;
        return sum;
    }
    public static void main(String[] args) {


     int boneshaker =  multiple(2,4);
        System.out.printf("%d%n",boneshaker);
//        double c= 13;
//        double d = 3.0;
//        double f = 4.0;
//if (c ==13.0 && d == 3.0 && f == 4.0){
//
//    System.out.println(Math.sqrt(c + d * f));

    SecureRandom random = new SecureRandom();

    int goat =  1+ random.nextInt(6) ;

        System.out.println(goat);

int [] myArray = new int[10];


Play.printArray(myArray);









}






public static void printArray(int [] array){

for (int counter = 0; counter < 10 ; counter++) {
    array[counter] = counter * 10;
    System.out.println("my array  " + array[counter]);
}
}
}

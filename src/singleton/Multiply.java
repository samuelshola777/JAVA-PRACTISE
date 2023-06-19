package singleton;

public class Multiply {

    public  int multiply(int number, int number2){
 int  newNumber = 0;
        for (int i = 0; i < number2; i++) {
           newNumber +=  number;
            System.out.println(newNumber);
        }
      return   newNumber;
    }

    public static void main(String[] args) {

//        System.out.println(multiply(9, 3));
    }
}

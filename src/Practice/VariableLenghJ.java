package Practice;

import java.util.ArrayList;
import java.util.List;

public class VariableLenghJ {


    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<Integer>();
        int recieved = 0;
        int number = 81;
int count = 2;

     while (number != 2 ){

    if (number % count == 0){
        System.out.println(count);
        count += 1;
    }

count++;
     }
//        System.out.println(listNumber.get(count));

    }

}
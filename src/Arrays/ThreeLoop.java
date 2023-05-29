package Arrays;

public class ThreeLoop {
    public static void main(String[] args) {


        int [] samArray = {69, 90 , 12 , 6, 90 , 1};

        int total = 0 ;

        for (int i = 0; i < samArray.length ; i++) {
          total = total + samArray[i];
        }
        System.out.println("the for loop total is "+ total);

        int counter = 0;
        int sum = 0 ;
        while (counter < samArray.length){


            sum = sum + samArray[counter];

            counter++;

        }
        System.out.println("the while loop total is  "+sum);

        int i = 0;
        int add = 0;
        do {
            add += samArray[i];
            i++;
        } while (i < samArray.length);
        System.out.println(" the total for the do while loop  "+add);
    }
}

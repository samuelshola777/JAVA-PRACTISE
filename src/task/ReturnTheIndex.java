package task;

public class ReturnTheIndex {
    public static void main(String[] args) {

int counter = 0;
        int[] number = {1,2,3,4,5};
        int [] receiverArray = new int[number.length];
        int target = 6;
        int count = 0;


            for (int j = 0; j < number.length; j++) {
        if (j == number.length-1){
                    count++;
                }
        if (number[j] + number[count] == target) System.out.println("samuelshola");
//                System.out.println(number[count]+" <- number at index count  number at index j ->  "+number[j]);
                System.out.println(number[count]+number[j]+" <--- ");

            }

    }
}

package task.chapter6;

public class AddTheFirstThree {
    public static void main(String[] args) {

        int[] arrayNum = {4, 9, 12, 13, 2, 1,0};
        int[] array = new int[3];

        for (int i = 0; i <= arrayNum.length - 3; i++) {
            for (int j = i; j < i+3; j++) {
//                temp = arrayNum[]
                System.out.println(arrayNum[j] + " ");
//                if (j)
            }
            System.out.println();
        }


    }
}

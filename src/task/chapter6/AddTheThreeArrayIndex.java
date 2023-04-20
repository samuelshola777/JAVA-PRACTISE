package task.chapter6;

public class AddTheThreeArrayIndex {
    public static void main(String[] args) {
        int[] arrayNum = {4, 9, 12, 13, 2, 1,0};

        for (int i = 0; i < arrayNum.length-3; i++) {
         int count = i;
            for (int j = 0 ; j < 3; j++) {
                System.out.print(arrayNum[count] + " ");
                count++;
//                count = i;
//                System.out.print(arrayNum[count]+" ");
//                if(count < 3)count++;

            }
            System.out.println();
        }

    }
}

package task;

public class AddTheHigestThree {
    public static void main(String[] args) {
        int max = 0;
        int start = 0;
        int range = 3;
        int[] number = {4, 9, 12, 13, 2, 1, 0};
        int[] tempArray = new int[3];
        int total = number[0] + number[1] + number[2];
        for (int i = 0; i < number.length - 3; i++) {
            if (total > max) {
                max = total;
            }
            total = total - number[start] + number[range];
            start++;
            range++;

        }
        System.out.println(max);
    }

}



package Arrays;

public class ConcatinationOfArray {
    public static void main(String[] args) {

        String[] sam = {"boneshaker, samuel shola,  wunmi, samuel segun"};
        int[] num = {90, 34, 69, 90};

        for (int i = 0; i < sam.length; i++) {
            System.out.printf(sam[i], ",");
        }
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d%s", num[i], ",");
        }


    }

}

package chapter7;

public class PlayWithArray {
    public static void main(String[] args) {
        int[] jArray = new int[190];
        for (int i = 0; i < jArray.length; i++) {

          jArray[i] = i;

            if (jArray[i] > 0 && jArray[i] < 10) {
                jArray[i] = 10;
            } else if (jArray[i] > 10 && jArray[i] < 30) {
                jArray[i] = 30;
            }else if (jArray[i] > 30 && jArray[i] < 50) {
                jArray[i] = 50;
            }else if (jArray[i] > 50 && jArray[i] < 70) {
                jArray[i] = 70;
            }else if (jArray[i] > 70 && jArray[i] < 90) {
                jArray[i] = 90;
            }else if (jArray[i] > 90 && jArray[i] < 110) {
                jArray[i] = 110;
            }else if (jArray[i] > 110 && jArray[i] < 130) {
                jArray[i] = 130;
            }else if (jArray[i] > 130 && jArray[i] < 150) {
                jArray[i] = 150;
            }else if (jArray[i] > 150 && jArray[i] < 170) {
                jArray[i] = 170;
            }else if (jArray[i] > 170 && jArray[i] < 190) {
                jArray[i] = 190;
            }
        }
        for (int i = 9; i < 20; i++) {
            jArray[i] = 0;
            jArray[i] *= 2;

        }
int [ ] sam = new int [30];
        for (int i = 9; i < 20; i++) {
            sam[i] = 0;
        }
        int [] bonus = new int[20];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] *= 10;
            bonus[i] *= 2;

        }

        int [] bestScore = new int[10];
        for (int i = 0; i < bestScore.length ; i++) {
            bestScore[i] *= 20;
            System.out.println(bestScore[i]);
        }



    }
}

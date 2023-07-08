package leetCode;

import java.util.Arrays;

public class BikeLargest {

//    static  int[] changeValue(int[] value){
//        int [] newValue = new int[value.length];
//        for (int i = 0; i < value.length; i++) {
//            if (value[i] < 0 || value[i] > 1){
//                value[i] = 0;
//            }
//            newValue[i] = value[i];
//        }
//        return newValue;
//    }
//There is a biker going on a road trip. The road trip consists of n + 1 points
//    at different altitudes. The biker starts
//    his trip on point 0 with altitude equal 0.
//
//    You are given an integer array gain of length n where gain[i] is the
//    net gain in altitude between points  and i + 1 for
//    all (0 <= i < n). Return the highest altitude of a point.
    public static int largestAltitude(int[] arrayNum) {
        int highest = 0;
        for(int i = 0; i < arrayNum.length; i++){
            if (0 > arrayNum[i] || arrayNum[i] != arrayNum.length+1){
                arrayNum[i] = 0;
            }
            if (highest < arrayNum[i] || arrayNum.length+1 < arrayNum[i]){
                highest = arrayNum[i];
            }
        }
      return highest;

    }


    public static void main(String[] args) {


      //  int[] arrayNum = {-5,1,5,0,-7};
        int[] arrayNum = {52,-91,72};
       System.out.println("==>  "+largestAltitude(arrayNum));
      //  System.out.println("===>  "+ Arrays.toString(changeValue(arrayNum)));
    }
}

package leetCode;

import Practice.Arrays;

public class IslandSearch {
    public static void main(String[] args) {
        char[] array = {'s', 'e', 'm', 'i', 'c', 'o', 'l', 'o', 'n'};
//arrayBlack(array);

//       char[] string = arrayBlack(array);
//        for (int i =  0 ;i < string.length; i++) {
//            System.out.print(string[i+1]+"  ");
//        }
        //way 1
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = array.length; i > 0; i--) stringBuffer.append(array[i - 1]);
//        System.out.println(stringBuffer.toString());
        //way 2
        String reversed = "";
        for(int i = array.length; i > 0; i--){
            reversed = reversed + array[i - 1];
        }
        System.out.println(reversed);

    }
    }
//public static void arrayBlack(char[]blue){
//
//    for (int i =  blue.length;  i > 0; i--){
//        blue[i] = blue[blue.length];
//        System.out.print(blue[i]-1+" ");
//    }
////     return blue;
//    }

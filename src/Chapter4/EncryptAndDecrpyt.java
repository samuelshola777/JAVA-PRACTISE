//package Chapter4;
//
//import java.util.Scanner;
//
//public class EncryptAndDecrpyt {
//    public static void main(String[] args) {
//        System.out.println(encryption());
//    }
//    public static String encryption(){
//        Scanner scanner = new Scanner(System.in);
//        int    num;
//        // the input and validation part
//        while (true) {
//            System.out.println("enter four number   ");
//            num = scanner.nextInt();
//            if (String.valueOf(num).length() > 4) {
//                continue;
//            }else {
//                break;
//            }
//        }
//        // separating the integer values
//        int firstNum = num / 1000;
//        int tem = num % 1000;
//        int secondNum = tem / 100;
//        tem = tem % 100;
//        int thirdNum = tem / 10;
//        tem = tem % 10;
//        int forthNum = tem;
//        // the adding 7 to all digit part
//        firstNum +=  7;
//        secondNum += 7;
//        thirdNum += 7;
//        forthNum += 7;
//        // the modulo phase
//        firstNum %= 10;
//        secondNum %= 10;
//        thirdNum %= 10;
//        forthNum %= 10 ;
//        // the switching value part
//        tem = firstNum;
//        firstNum = thirdNum;
//        thirdNum = tem;
//        tem = forthNum;
//        forthNum = secondNum;
//        secondNum = tem;
//
//        return String.format("%d%d%d%d",firstNum, secondNum, thirdNum, forthNum);
//
//    }
//    public static String decryption(int encryptedValue){
//        int firstValue = encryptedValue / 1000;
//        encryptedValue %= 1000;
//        int secondValue = encryptedValue / 100;
//        encryptedValue %= 100;
//        int thirdValue = encryptedValue / 10;
//        encryptedValue %=10;
//
//
//    }
//}

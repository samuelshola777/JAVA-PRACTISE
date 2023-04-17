package task.chapter4;

public class EncryptingAndDecrypting {
    public static String ifContainAlphabetic(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isAlphabetic(word.charAt(i))) {
                return "this is a highly secured platform please \n" +
                        "be mindfull of the data you pass in to this platform";
            }
        }
        return word;
    }

    public static String encryption(String number){
      int[] holder = new int [number.length()];
      int[] holder1 = new int [number.length()];
        String stringReceiver = " ";
      int arrayReceiver = 0;
        String newNumber = ifContainAlphabetic(number);
        for (int i = 0; i < newNumber.length(); i++) {
   holder[i] =   Integer.parseInt(String.valueOf(newNumber.charAt(i)));
        }
        for (int i = 0; i < holder.length; i++) {
            holder1[i] = holder[i] * 7;
           holder[i] =   holder1[i]  % 10 ;
            stringReceiver += String.valueOf(holder[i]);
//
        }
//        holder[3] = holder[1];
//        holder[0] = holder[2];
//        stringReceiver += String.valueOf(holder[0]);
//        stringReceiver += String.valueOf(holder[1]);
//        stringReceiver += String.valueOf(holder[2]);
//        stringReceiver += String.valueOf(holder[3]);
        return stringReceiver;
    }

    public static void main(String[] args) {

        System.out.println(encryption("1234"));

    }

}

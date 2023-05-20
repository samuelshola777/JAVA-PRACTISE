package codeWars;

public class ReturnPhoneNumber {
    public static String phoneNumber(int [] myArray){
        StringBuilder builder = new StringBuilder();
        String phoneNumber = "";

        if (myArray.length == 10){
            for (int i = 0; i < myArray.length; i++){
               //  phoneNumber.charAt(i) = String.valueOf(myArray[i]);
                builder.append(String.valueOf(myArray[i]));
                phoneNumber = builder.toString();
            }
            String firstThree = phoneNumber.substring(0,3);
           String secondThree = phoneNumber.substring(3,6);
           String lastFor = phoneNumber.substring(6,10);
           return "("+firstThree+") "+secondThree+"-"+lastFor;
        }
        return null;
    }
public static void main(String[] args) {

    System.out.println(phoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
}
       }

//    }


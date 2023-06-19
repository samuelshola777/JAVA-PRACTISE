package Chapter6;

public class BeautifyingString {

    public static String addFullStop(String word){
String point = ".";
        StringBuilder stringBuilder =  new StringBuilder(word);
        if (!word.endsWith(point)){
        stringBuilder.append(point);
        }
return stringBuilder.toString();
    }
    public static String myToUppCase(String word){
        if (word.substring(0,1).equals(" ")){
            word = word.substring(1,word.length()-1);
        }
        String firstLetter = word.substring(0,1);
       String removedFirstChar = word.substring(1,word.length() - 1);
       return firstLetter.toUpperCase()+removedFirstChar;
    }
    public static String stringBeautified(String word) {
      return   addFullStop(myToUppCase(word));
    }

    public static void main(String[] args) {
        String word = " my name is samuel shola i'm a software engineer";
        System.out.println(stringBeautified(word));
//        System.out.println(addFullStop(word));
    }



}

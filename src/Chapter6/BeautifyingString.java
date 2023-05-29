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
    public String myToUppCase(String word){

    }

    public static void main(String[] args) {
        String word = "Boneshaker.";

        System.out.println(addFullStop(word));
    }



}

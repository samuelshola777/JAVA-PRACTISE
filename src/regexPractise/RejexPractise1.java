package regexPractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexPractise1 {

    public static void main(String[] args) {
        //TODO //d means number(1 //d stands for one number 2 //d//d stands for two numbers)
    //todo in the example below measn we're expecting a patternof agent and 3 number

String goat = "agent 007";
//        Pattern pattern = Pattern.compile("agent \\d\\d\\d");
//        Matcher matcher = pattern.matcher("agent 007");
//        boolean found = matcher.find();
//        System.out.println(found);
//         Pattern pattern1 = Pattern.compile("agent \\d{3}");
//        Matcher matcher1 = pattern1.matcher("agent 007");
//        boolean found1 = matcher1.find();
//        System.out.println(found1);

        //TODO: the ',' character means the String is supposed to have atleast 3 number
 Pattern pattern1 = Pattern.compile("agent \\d{3,}");
        Matcher matcher1 = pattern1.matcher("agent 007");
        boolean found1 = matcher1.find();
        System.out.println(found1);


    }

}

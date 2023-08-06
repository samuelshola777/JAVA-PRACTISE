package regexPractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexPractise1 {

    public static void main(String[] args) {
        //TODO //d means number(1 //d stands for one number 2 //d//d stands for two numbers)
    //todo in the example below measn we're expecting a patternof agent and 3 number

String goat = "agent 007";
        Pattern pattern = Pattern.compile("agent \\d\\d\\d");
        Matcher matcher = pattern.matcher("agent 007");
        boolean found = matcher.find();
        System.out.println(found);
    }

}

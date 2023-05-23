package codeWars;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public  String remove(String word){
//      String collect = "";
        StringBuilder collect = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
           if (Character.isAlphabetic(word.charAt(i))) {
      collect.append( word.charAt(i));
           }
        }
        return collect.toString();
    }
    public  boolean checkPangram(String word) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String collect = remove(word);
        Set<String> letter = new HashSet<>();
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < collect.length(); j++) {

                if (alphabet[i].equalsIgnoreCase(String.valueOf(collect.charAt(j)))) {
                    letter.add(String.valueOf(collect.charAt(j)));

                }
            }
        }
        System.out.println(letter);
        return letter.size() == 26;
    }

    public static void main(String[] args) {
        String words = "The quick brown fox jumps over the lazy dog" ;
PangramChecker para = new PangramChecker();
        System.out.println(para.checkPangram(words));

    }
}

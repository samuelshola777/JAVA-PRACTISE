package codeWars;

public class PangramChecker {

    public static String remove(String word){
//      String collect = "";
        StringBuilder collect = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
           if (Character.isAlphabetic(word.charAt(i))) {
      collect.append( word.charAt(i));
           }
        }
        return collect.toString();
    }
    public static boolean checkPangram(String word){
        String [] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int count = 0;
        String collect = remove(word);

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
              if ( alphabet[j].equalsIgnoreCase(String.valueOf(word.charAt(i)))){
                  count++;
                  if (count == word.length()){
                      return true;
                  }
              }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkPangram("The quick brown fox jumps over the lazy dog"));

    }
}

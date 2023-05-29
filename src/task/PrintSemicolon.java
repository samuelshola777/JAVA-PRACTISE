package task;

public class PrintSemicolon {
    public static void main(String[] args) {
        String colon = "SEMICOLON";
        char [] semi = new char[colon.length()];
        for (int i = 0; i < colon.length(); i++) {
            semi[i] = colon.charAt(i);
            System.out.println(semi[i]);
        }

    }
}
